package BD;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Departamento;
import modelos.Departamentos;
import modelos.Empleado;
import modelos.Empleados;

/**
 *
 * @author Javier Fernandez Paniagua
 */
public class GestionBD {
    
    // Atributos
    private final String HOST;
    private final String USUARIO;
    private final String PASSWORD;
    private final String BD;
    private Connection conexion;

    public GestionBD(String HOST, String USUARIO, String PASSWORD, String BD) {
        this.HOST = HOST;
        this.USUARIO = USUARIO;
        this.PASSWORD = PASSWORD;
        this.BD = BD;
    }

    
    /**
     * Método para realizar la conexión con la BD
     * @return - boolean - Devuelve true si se ha conectado, en caso contrario
     * false.
     */
    private boolean conectar(){
        
        boolean isConectado = true;
        
        try {
            // Indicamos el driver utilizado para la conexión
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Inicializamos la cadena de conexion
            this.conexion = DriverManager.getConnection( "jdbc:mysql://" + HOST + "/" + BD, USUARIO, PASSWORD );
            
        } catch(ClassNotFoundException e) {
            System.err.println("Error al cargar el driver MySQL, " + e.getMessage());
            isConectado = false;
            
        }  catch(SQLException e) {
            System.err.println("Error de conexión, " + e.getMessage());
            isConectado = false;
            
        }
        
        return isConectado;
        
    }
    
    /**
     * Método para finalizar la conexión
     * @return boolean - Devulve true si se ha finalizado la conexión,
     * false en caso contrario.
     */
    private boolean desconectar(){
        
        boolean isDesconectado = true;
        
        try {
            this.conexion.close();
        } catch(SQLException e) {
            System.err.println("Error en la desconexión, " + e.getMessage());
            isDesconectado = false;
        }
        
        return isDesconectado;
        
    }
    
    /**
     * Método para insertar un departamento en la BD
     * @param departamento - Departamento - departamento a insertar
     * @return boolean - Devuelve true si se ha insertado, false en
     * caso contrario
     */
    public boolean insertarDepartamento( Departamento departamento ) {
        boolean insertado = false;
        
        // Nos conectamos a la BD
        conectar();
        
        // Preparamos la cadena de inserción
        try {
            PreparedStatement ps = conexion.prepareStatement(
                    "INSERT INTO Departamentos"
                            + " VALUES (NULL, ?)"
            );
            
            // Enlazamos los valores con su posición correspondiente
            ps.setString(1, departamento.getNombre());
            
            // Ejecutamos la sentencia
            if (ps.execute()) {
                insertado = true;
            }
            
            // Nos desconectamos
            ps.close();
            desconectar();
            
        } catch (SQLException ex) {
            System.err.println("Error al insertar, " + ex.getMessage());
        }
        
        return insertado;
    }
    
    /**
     * Método para insertar un empleado en la BD
     * @param empleado - Empleado - empleado a insertar
     * @return boolean - Devuelve true si se ha insertado, en caso contrario
     * false.
     */
    public boolean insertarEmpleado( Empleado empleado ) {
        boolean insertado = false;
        
        // Nos conectamos a la BD
        conectar();
        
        try {
            // Preparamos la cadena de inserción
            PreparedStatement ps = conexion.prepareStatement(
                    "INSERT INTO empleados"
                    + " VALUES ( NULL, ?, ?, ?, ?, ? )"
            );
            
            // Enlazamos los valores a la sentencia en su posición correspondiente
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setFloat(3, empleado.getSalario());
            ps.setString(4, empleado.getEmail());
            ps.setInt(5, empleado.getDpt().getIdDepartamento());
            
            // Ejecutamos la sentencia
            if( ps.execute() ) {
                insertado = true;
            }
            
            // Nos desconectamos de la BD
            ps.close();
            desconectar();
            
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al insertar" + ex.getMessage());
        }
        
        return insertado;
    }
    
    /**
     * Método para borrar un empleado de la BD
     * @param empleado - Empleado - empleado a borrar de la BD
     * @return - boolean - Retorna true si lo ha borrado, en caso contrario
     * retornará false.
     */
    public boolean borrarEmpleado( Empleado empleado ){
        
        boolean borrado = false;
        
        conectar();
        
        try {
            PreparedStatement ps = this.conexion.prepareStatement(
                    "DELETE * FROM empleados WHERE idEmpleado = ?"
            );
            
            ps.setInt(1, empleado.getIdEmpleado());
            
            if (ps.execute()) {
                borrado = true;
            }
            
            ps.close();
            desconectar();
            
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al borrar, " + ex.getMessage());
        }
        
        return borrado;
        
    }
    
    /**
     * Método para actualizar los datos de un empleado
     * @param empOld - Empleado - empleado al que actualizaremos los datos
     * @param empNew - Empleado - nuevos datos del empleado
     * @return boolean - Devuelve true si lo ha podido actualizar, en caso
     * contrario devolverá false
     */
    public boolean modificarEmpleado( Empleado empOld, Empleado empNew ) {
        
        boolean modificado = false;
        
        conectar();
        
        try {
            PreparedStatement ps = this.conexion.prepareStatement(
                    "UPDATE empleados SET nombre = ?, apellidos = ?,"
                            + " salario = ?, email = ?, idDepartamento = ?"
                            + " WHERE idEmpleado = ?"
            );
            
            ps.setString(1, empNew.getNombre());
            ps.setString(2, empNew.getApellido());
            ps.setFloat(3, empNew.getSalario());
            ps.setString(4, empNew.getEmail());
            ps.setInt(5, empNew.getDpt().getIdDepartamento());
            ps.setInt(6, empOld.getIdEmpleado());
            
            if (ps.execute()) {
                modificado = true;
            }
            
            ps.close();
            desconectar();
            
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al actualizar, " + ex.getMessage());
        }
        
        return modificado;
        
    }
    
    /**
     * Método para listar todos los empleados de la tabla empleados
     * @return Empleados - Nos devuelve una lista con todos los empleados
     * de la tabla.
     */
    public Empleados listarEmpleados(){
        
        Empleados listaEmpleados = new Empleados();
        Departamentos departamentos = new Departamentos();
        
        conectar();
        
        try {
            PreparedStatement ps = this.conexion.prepareStatement(
                    "SELECT * FROM empleados"
            );
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Empleado empleado = new Empleado(rs.getInt(1), 
                        rs.getString(2), rs.getString(3), 
                        rs.getFloat(4), rs.getString(5), 
                        departamentos.getDepartamento(
                                rs.getInt(6)
                        )
                );
                
                listaEmpleados.addEmpleado(empleado);
            }
            
            rs.close();
            ps.close();
            
            desconectar();
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al recoger los datos, " + ex.getMessage());
        }  
        
        return listaEmpleados;
        
    }
    
    
    
}
