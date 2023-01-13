package BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Departamento;
import modelos.Empleado;

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

    public GestionBD(String HOST, String USUARIO, String PASSWORD, String BD, Connection conexion) {
        this.HOST = HOST;
        this.USUARIO = USUARIO;
        this.PASSWORD = PASSWORD;
        this.BD = BD;
        this.conexion = conexion;
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
            desconectar();
            
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al insertar" + ex.getMessage());
        }
        
        return insertado;
    }
    
    
    
}
