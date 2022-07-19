package Ejercicio1y2.Servicio;

import Ejercicio1y2.Entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServicio {

    private ArrayList<Perro> nuevaLista;
    private Scanner leer;

    public PerroServicio() {
        this.nuevaLista = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarRaza() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese la raza del perro");
            String razaPerro = leer.next();
            razaPerro = razaPerro.toUpperCase();

            nuevaLista.add(new Perro(razaPerro));

            System.out.println("Quiere agragar otro perro o quiere salir? "
                    + "SALIR///AGREGAR");
            String decision;
            decision = leer.next();
            decision = decision.toUpperCase();

            if (decision.equals("AGREGAR")) {
                i = -1;
            } else {
                i = 1;
            }
        }
    }

    public void imprimirRaza() {

        for (Perro unitariaRaza : nuevaLista) {
            System.out.println(unitariaRaza.toString());
        }
    }

    public void buscarYeliminarPerro() {
        String razaPerro;
        System.out.println("Ingrese una raza de perro para eliminar en la lista");
        razaPerro = leer.next();
        razaPerro = razaPerro.toUpperCase();

        Iterator<Perro> it = nuevaLista.iterator();

        while (it.hasNext()) {
            Perro aux = it.next();

            if (aux.getRaza().equals(razaPerro)) {
                it.remove();
                System.out.println("La lista con el perro eliminado es:");
                for (Perro unitariaRaza : nuevaLista) {
                    System.out.println(unitariaRaza.toString());
                }
            } else {
                System.out.println("Esa raza no se encuentra en la lista");
                for (Perro unitariaRaza : nuevaLista) {
                    System.out.println(unitariaRaza.toString());
                }
            }
        }
    }
}
