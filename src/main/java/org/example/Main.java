package org.example;

import org.example.data.Student;
import org.example.data.generatedFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insertar datos");
            System.out.println("2. Leer datos");
            System.out.println("2. Buscar porID");
            System.out.println("3. Modificar datos");
            System.out.println("4. Eliminar datos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pedirDatos();
                    break;
                case 2:
                    // leerDatos();
                    break;
                case 3:
                    // modificarDatos();
                    break;
                case 4:
                    // eliminarDatos();
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);
    }

    public static void pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        String genre = null;
        generatedFile gf = new generatedFile();

        System.out.print("Introduce tu matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String primerApellido = scanner.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        String segundoApellido = scanner.nextLine();

        System.out.print("Introduce tu género (1.-M/2.-F): ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer de entrada

        if (option == 1) {
            genre = "M";
        } else if (option == 2) {
            genre = "F";
        } else {
            System.out.println("variable incorrecta");
            return;
        }

        System.out.print("Introduce tu clave de licenciatura: ");
        String claveLicenciatura = scanner.nextLine();

        gf.generarFormato(new Student(matricula, nombre, primerApellido, segundoApellido, claveLicenciatura, genre));
    }
}