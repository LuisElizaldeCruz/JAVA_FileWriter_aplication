package org.example.data;

import java.io.*;
import java.util.ArrayList;

public class generatedFile {
    File path = new File("C:\\Users\\luisw\\Documents\\JAVA\\registroAlumos\\files");

    public void generarFormato(Student st) {
        ArrayList<String> studentArray = new ArrayList<>();
        studentArray.add(st.getMatricula());
        studentArray.add(st.getNombre());
        studentArray.add(st.getPrimerApellido());
        studentArray.add(st.getSegApellido());
        studentArray.add(st.getGenre());
        studentArray.add(st.getKeyBachellor());

        System.out.println(st.toString());
        generarArchivo(studentArray);
    }

    public void generarArchivo(ArrayList<String> studentArray) {
        String file = "data.txt";
        try {
            FileWriter fileOut = new FileWriter(path+"\\"+file,true);
            for (int i = 0; i < studentArray.size(); i++) {
                fileOut.write(studentArray.get(i).toUpperCase());
                if (i < studentArray.size() - 1) {
                    fileOut.write(",");
                }
            }
            fileOut.write("\n");
            fileOut.close();
            System.out.println("datos guardados en el archivo");
        }catch (IOException e){
            System.out.println("Error al guardar datos: "+e.getMessage());
        }
    }
}
