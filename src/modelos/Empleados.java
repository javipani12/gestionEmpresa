package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier Fernandez Paniagua
 */
public class Empleados {
    
    private List<Empleado> listaEmpleados;

    public Empleados() {
        listaEmpleados = new ArrayList();
    }
    
    // Métodos GET
    /**
     * Método para obtener un empleado de la lista de empleados
     * @param idEmpleado - int - ID del empleado a buscar
     * @return Empleado - Si encuentra el empleado nos lo devuelve, 
     * si no lo encuentra nos devuelve uno nulo.
     */
    public Empleado getEmpleado( int idEmpleado ){
        
        Empleado empleadoEncontrado = null;
        
        for (Empleado empleado : listaEmpleados) {
            if ( empleado.getIdEmpleado() == idEmpleado ) {
                empleadoEncontrado = empleado;
            }
        }
        
        return empleadoEncontrado;
    }
    
    // Métodos SET
    /**
     * Método para eliminar un empleado de lista de empleados
     * @param idEmpleado - int - ID del empleado a eliminar
     * @return boolean - Nos devuelve true si lo ha elimanado,
     * en caso contrario false.
     */
    public boolean deleteEmpleado( int idEmpleado ){
        return listaEmpleados.remove(getEmpleado(idEmpleado));
    }
    
    
    
}