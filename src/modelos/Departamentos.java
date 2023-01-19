package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier Fernandez Panaigua
 */
public class Departamentos {
    
    // Atributos
    private List<Departamento> listaDepartamentos;

    public Departamentos() {
        this.listaDepartamentos = new ArrayList();
    }

    // Métodos SET
    /**
     * Método para añadir un departamento a la lista de departamentos
     * @param dep - Departamento - Departamento a añadir a la lista
     */
    public void add( Departamento dep ){
        this.listaDepartamentos.add(dep);
    }
    
    /**
     * Método para eliminar un departamento de la lista de departamentos
     * @param idDepartamento - int - ID del departamento a buscar
     * @return boolean - true lo ha eliminado, false no lo ha eliminado
     */
    public boolean delete( int idDepartamento ){
        boolean encontrado = false;
        
        for (Departamento dept : listaDepartamentos) {
            if (dept.getIdDepartamento() == idDepartamento) {
                encontrado = true;
                listaDepartamentos.remove(dept);
            }
        }
        
        return encontrado;
    }
    
    // Métodos GET
    public List<Departamento> getListaDepartamentos() {
        return this.listaDepartamentos;
    }
    
    /**
     * Nos devuelve un departamento de la lista
     * @param idDepartamento - int - ID del departamento a buscar
     * @return Departamento - nos devuelve el Departamento encontrado,
     * si no encuentra ningún Departamento devuelve uno nulo
     */
    public Departamento getDepartamento( int idDepartamento ){
        
        Departamento departamento = null;
        
        for (Departamento dept : listaDepartamentos) {
            if( dept.getIdDepartamento() == idDepartamento ){
                departamento = dept;
            }
        }
        
        return departamento;
    }
    
    /**
     * 
     * @param posicion
     * @return 
     */
    public Departamento getDepartamentoBis( int posicion){
        return listaDepartamentos.get(posicion);
    }
    
}
