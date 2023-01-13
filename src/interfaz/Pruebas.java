package interfaz;

import BD.GestionBD;
import modelos.Departamento;
import modelos.Empleado;

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
        
        GestionBD gestionBD = new GestionBD("localhost", "javier", "javier", "empresa");
        
        gestionBD.insertarDepartamento(departamento);
        gestionBD.insertarEmpleado(empleado);
        
    }
    
}
