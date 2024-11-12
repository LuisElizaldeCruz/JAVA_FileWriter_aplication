package org.example.data;

public class Student {
    String matricula;
    String nombre, primerApellido, SegApellido;
    String keyBachellor;
    String genre;

    public Student(){

    }

    public Student(String matricula, String nombre, String primerApellido, String segApellido, String keyBachellor, String genre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        SegApellido = segApellido;
        this.keyBachellor = keyBachellor;
        this.genre = genre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegApellido() {
        return SegApellido;
    }

    public void setSegApellido(String segApellido) {
        SegApellido = segApellido;
    }

    public String getKeyBachellor() {
        return keyBachellor;
    }

    public void setKeyBachellor(String keyBachellor) {
        this.keyBachellor = keyBachellor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", SegApellido='" + SegApellido + '\'' +
                ", keyBachellor='" + keyBachellor + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
