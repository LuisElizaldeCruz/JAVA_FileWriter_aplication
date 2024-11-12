package org.example;

import org.example.data.Student;
import org.example.data.generatedFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        if(option == 1){
            genre = "M";
        }else if(option == 2){
            genre = "F";
        } else{
            System.out.println("variable incorrecta");
            return;
        }

        System.out.print("Introduce tu clave de licenciatura: ");
        String claveLicenciatura = scanner.nextLine();

        gf.generarFormato( new Student(matricula, nombre, primerApellido, segundoApellido, claveLicenciatura, genre));
    }
}