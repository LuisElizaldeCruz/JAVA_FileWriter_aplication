package org.example.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class OperacionDatos implements CrudOperations{

    public List<Student> leerDatos(String filePath, String name){
        List<Student> students = new ArrayList<Student>();

        try{
            String line;
            FileReader fileReader = new FileReader(filePath+name);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null){
                Student student = new Student();
                String[] partes = line.split(",");
                if(partes.length ==6) {
                    student.setMatricula(partes[0]);
                    student.setNombre(partes[1]);
                    student.setPrimerApellido(partes[2]);
                    student.setSegApellido(partes[3]);
                    student.setGenre(partes[4]);
                    student.setKeyBachellor(partes[5]);

                    students.add(student);
                }
            }

        }catch(Exception e){
            System.out.println("error leyendo el archivo: " + e.getMessage());
        }
        return students;
    }

    public void buscarPorId(){

    }

    public void modificarDatos(){

    }

    public void eliminarDatos(){

    }
}
