package interfaz;

import BD.GestionBD;
import modelos.Departamento;
import modelos.Departamentos;
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
        
        Departamento departamento = new Departamento(23,"Administración");
        Departamento departamento2 = new Departamento(26,"Dirección");
//        Empleado empleado = new Empleado(25, "Lola", "Farias", 1345.69F, "lolalolitalola@lola.com", departamento);
//        Empleado empleado2 = new Empleado(1, "Maria", "Farias", 1345.69F, "lolalolitalola@lola.com", departamento);
//        
        GestionBD gestionBD = new GestionBD("localhost", "javier", "javier", "empresa");
//        
//        gestionBD.insertarDepartamento(departamento);
//        gestionBD.insertarEmpleado(empleado);
//        
//        gestionBD.insertarEmpleado(empleado);
//        gestionBD.modificarEmpleado(empleado, empleado2);
//        
//        gestionBD.borrarEmpleado(empleado);
//
//        Empleados empleados = gestionBD.listarEmpleados();
//        for (Empleado empleadoLista : empleados.getListaEmpleados()) {
//            System.out.println(empleadoLista.toString());
//        }
        
//        gestionBD.insertarDepartamento(departamento);
//        gestionBD.modificarDepartamento(departamento, departamento2);
//        
//        gestionBD.insertarDepartamento(departamento2);
//        gestionBD.borrarDepartamento(departamento2);

        Departamentos departamentos = gestionBD.listarDepartamentos();
        for (Departamento departamentoListar : departamentos.getListaDepartamentos()) {
            System.out.println(departamentoListar.toString());
        }
    }
    
}
