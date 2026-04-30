/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion.t1;

import java.util.Scanner;

/**
 *
 * @author UCC20319
 */
public class EVALUACIONT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Creamos el controlador que maneja la lista
        GestorTrabajadores gestor = new GestorTrabajadores();
        int opcion;

        do {
            // MENU PRINCIPAL
            System.out.println("=== MENU ===");
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Ver todos");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                // Pedimos los datos del trabajador al usuario
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Tipo de documento (DNI / RT): ");
                String tipoDocumento = sc.nextLine();

                System.out.print("Nro de documento: ");
                String nroDocumento = sc.nextLine();

                System.out.print("Regimen (728 / LOCACION): ");
                String regimen = sc.nextLine();

                System.out.print("Fondo pension (AFP_INTEGRA / AFP_PRIMA / AFP_HABITAT / ONP): ");
                String fondoPension = sc.nextLine();

                System.out.print("Salario base: ");
                double salario = Double.parseDouble(sc.nextLine());

                System.out.print("Tiene hijos? (true / false): ");
                boolean tieneHijos = Boolean.parseBoolean(sc.nextLine());

                System.out.print("Turno nocturno? (true / false): ");
                boolean turnoNocturno = Boolean.parseBoolean(sc.nextLine());
                // Creamos el objeto Trabajador con los datos ingresados
                Trabajador t = new Trabajador(nombre, tipoDocumento, nroDocumento,regimen, fondoPension, salario,tieneHijos, turnoNocturno);
                 // Lo agregamos a la lista del gestor
                gestor.agregar(t);

            } else if (opcion == 2) {
                // Mostramos todos los trabajadores registrados
                gestor.listarTodos();
            }

        } while (opcion != 0); // El programa sigue hasta que el usuario elija 0


        System.out.println("Fin del programa.");
        sc.close(); //cierra scanner
        
    }
    
}
