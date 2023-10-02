package co.edu.uniquindio.prestamouq.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrestamoUq {
    private String nombre;



    List<Objeto> listaObjetos = new ArrayList<>();

    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }



    /**
     * Método para crar objetos
     * @param nombre
     * @return boolean
     */

    public Boolean crearObjeto(String nombre){
        Objeto objeto = new Objeto();
        objeto.setNombre(nombre);
        getListaObjetos().add(objeto);

        return true;
    }

    /**
     * método para obtener la lista de objetos
     * @return List<objeto>
     */

    public List<Objeto> obtenerObjetos(){
        return getListaObjetos();
    }

    /**
     * método para eliminar objetos
     * @param nombre
     */

    public void eliminarObjeto(String nombre) {
        int tamanioLista = getListaObjetos().size();
        for (int i=0; i < tamanioLista; i++){
            Objeto objeto = getListaObjetos().get(i);
            if(objeto.getNombre().equalsIgnoreCase(nombre)){
                getListaObjetos().remove(i);
                break;
            }
        }
    }

    /**
     * método para actualizar objetos
     * @param nombre
     */
    public void actualizarObjeto(String nombre) {
        Scanner actualizar = new Scanner(System.in);
        System.out.println("Ingrese el nuevo nombre: ");
        String nombreNuevo = actualizar.next();
        int tamanioLista = getListaObjetos().size();
        for (int i=0; i < tamanioLista; i++){
            Objeto objeto = getListaObjetos().get(i);
            if(objeto.getNombre().equalsIgnoreCase(nombre)){
                getListaObjetos().get(i).setNombre(nombreNuevo);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
