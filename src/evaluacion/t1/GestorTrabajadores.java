/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion.t1;

import java.util.ArrayList;

/**
 *
 * @author UCC20319
 */
public class GestorTrabajadores {
    
    // Atributos Lista que guarda todos los trabajadores registrados
    private ArrayList<Trabajador> lista = new ArrayList<>();

    //Agrega un trabajador a la lista
    public void agregar(Trabajador t) {
        lista.add(t);
        System.out.println("Trabajador agregado correctamente.");
    }
  // Muestra todos los trabajadores de la lista
    public void listarTodos() {
        if (lista.isEmpty()) { // Si la lista esta vacia, avisa y termina el metodo
            System.out.println("No hay trabajadores registrados.");
            return;
        }
        for (Trabajador t : lista) { //recorre la lista y muestra cada trabajador
            t.mostrar();
        }
    }
}
