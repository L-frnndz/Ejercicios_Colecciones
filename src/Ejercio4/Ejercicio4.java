/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:

En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.///
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.///
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla. ///
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Ejercio4;

import Ejercio4.Entidades.Pelicula;
import Ejercio4.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> ListaPeliculas = new ArrayList();

        String decision;

        do {
            Pelicula peli = new Pelicula();
            System.out.println("Ingrese el Titulo de la pelicula");
            peli.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del Director de la pelicula");
            peli.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula (en horas)");
            peli.setDuracion(leer.nextInt());
            ListaPeliculas.add(peli);
            System.out.println("Desea crear otra pelicula?");
            decision = leer.next();
        } while (decision.equalsIgnoreCase("si"));
        System.out.println("MOSTRAR TODAS LAS PELICULAS");
        for (Pelicula aux : ListaPeliculas) {
            System.out.println(aux);
        }
        System.out.println("PELICULAS DE MAYOR DURACION A 1 HORA");

        for (Pelicula aux : ListaPeliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }

        for (Pelicula aux : ListaPeliculas) {
            System.out.println();
        }
        System.out.println("MOSTRAR PELICULAS DE MAYOR A MENOR");
        Collections.sort(ListaPeliculas, Comparadores.OrdenardeMayoraMenor);
        for (Pelicula aux : ListaPeliculas) {
            System.out.println(aux);
        }

        System.out.println("MOSTRAR PELICULAS DE MENOR A MAYOR");
        Collections.sort(ListaPeliculas, Comparadores.OrdenardeMenoraMayor);
        for (Pelicula aux : ListaPeliculas) {
            System.out.println(aux);
        }

        System.out.println("MOSTRAR PELICULAS POR TITULO");
        Collections.sort(ListaPeliculas, Comparadores.OrdenarporTitulo);
        for (Pelicula aux : ListaPeliculas) {
            System.out.println(aux);
        }
        System.out.println("MOSTRAR PELICULAS POR DIRECTOR");
        Collections.sort(ListaPeliculas, Comparadores.OrdenarporDirector);
        for (Pelicula aux : ListaPeliculas) {
            System.out.println(aux);
        }
    }

}
