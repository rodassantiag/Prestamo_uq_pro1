package co.edu.uniquindio.prestamouq;

import co.edu.uniquindio.prestamouq.model.Objeto;
import co.edu.uniquindio.prestamouq.model.PrestamoUq;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq = inializarDatosPrueba();

        //CRUD

        //Create
        crearObjeto("Libro", prestamoUq);
        crearObjeto("Computador", prestamoUq);
        crearObjeto("Pieza electrónica", prestamoUq);

        System.out.println("----> Información objetos");
        mostrarInformacionObjeto(prestamoUq);

        System.out.println("1- Crear objeto");
        System.out.println("2- Eliminar objeto");
        System.out.println("3- Actualizar informacion");

        Scanner usuario = new Scanner(System.in);
        int eleccion;
        System.out.println("Ingrese lo que desea hacer: ");
        eleccion = usuario.nextInt();

        if (eleccion == 1){
            //create
            Scanner crearObjeto = new Scanner(System.in);
            System.out.println("Ingrese el objeto que desea añadir: ");
            String objetoNuevo = crearObjeto.next();
            crearObjeto(objetoNuevo,prestamoUq);
        }
        if (eleccion == 2){
            //Delete
            Scanner eliminar = new Scanner(System.in);
            System.out.println("Ingrese el objeto que quiere eliminar: ");
            String objetoEliminado = eliminar.next();


            eliminarObjeto(prestamoUq, objetoEliminado);
            System.out.println("----> Información luego de eliminar");
            mostrarInformacionObjeto(prestamoUq);

        }

        if (eleccion == 3){
            //Update
            Scanner actualizar = new Scanner(System.in);
            System.out.println("Ingrese el objeto que quiere actualizar: ");
            String objetoDesactualizado = actualizar.next();

            actualizarObjeto(prestamoUq, objetoDesactualizado);


            System.out.println("----> Información luego de actualizar");
            mostrarInformacionObjeto(prestamoUq);
        }
    }
    private static PrestamoUq inializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo Rapido");

        return prestamoUq;
    }


    private static void crearObjeto(String nombre, PrestamoUq prestamoUq){
        prestamoUq.crearObjeto(nombre);
    }

    private static void mostrarInformacionObjeto(PrestamoUq prestamoUq){
        List<Objeto> listaObjetos = prestamoUq.obtenerObjetos();
        int tamanioLista = listaObjetos.size();
        for (int i = 0; i < tamanioLista; i++){
            Objeto objeto = listaObjetos.get(i);
            System.out.println(objeto.toString());
        }
    }

    private static void eliminarObjeto(PrestamoUq prestamoUq, String nombre){
        prestamoUq.eliminarObjeto(nombre);
    }

    private static void actualizarObjeto(PrestamoUq prestamoUq, String nombre){
        prestamoUq.actualizarObjeto(nombre);
    }





}