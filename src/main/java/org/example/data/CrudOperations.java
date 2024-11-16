package org.example.data;

import java.util.List;

public interface CrudOperations {
    public List<Student> leerDatos(String filePath, String name);

    public void buscarPorId();

    public void modificarDatos();

    public void eliminarDatos();

}
