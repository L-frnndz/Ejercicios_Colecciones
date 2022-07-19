package Ejercio4.Utilidades;

import Ejercio4.Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> OrdenardeMayoraMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {

            return o2.getDuracion().compareTo(o1.getDuracion());
        }

    };
    public static Comparator<Pelicula> OrdenardeMenoraMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {

            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    public static Comparator<Pelicula> OrdenarporTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {

            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    public static Comparator<Pelicula> OrdenarporDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {

            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}
