package Ejercicio3.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    String nombre;
    private ArrayList<Integer> Notas;
    private Scanner leer;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> Notas, Scanner leer) {
        this.nombre = nombre;
        this.Notas = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Integer> Notas) {
        this.Notas = Notas;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", Notas=" + Notas + '}';
    }
}
