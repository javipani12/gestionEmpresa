package interfaz;

import BD.GestionBD;
import java.util.List;
import modelos.Departamento;
import modelos.Empleado;
import modelos.Empleados;

/**
 *
 * @author Javier Fernandez Paniagua
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Departamento departamento = new Departamento(1,"Administración");
        Empleado empleado = new Empleado("Lola", "Farias", 1345.69F, "lolalolitalola@lola.com", departamento);
        Empleado empleado2 = new Empleado("Maria", "Farias", 1345.69F, "lolalolitalola@lola.com", departamento);
        
        GestionBD gestionBD = new GestionBD("localhost", "javier", "javier", "empresa");
        
        gestionBD.insertarDepartamento(departamento);
        gestionBD.insertarEmpleado(empleado);
        
        gestionBD.borrarEmpleado(empleado);
        
        gestionBD.insertarEmpleado(empleado);
        gestionBD.modificarEmpleado(empleado, empleado2);

        List<Empleado> empleados = gestionBD.listarEmpleados().getListaEmpleados();
        for (Empleado empleadoMP : empleados) {
            System.out.println(empleadoMP);
        }
        
    }
    
}
