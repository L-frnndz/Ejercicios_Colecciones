/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.///
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.///
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package Ejercicio3;

import Ejercicio3.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String decision = "Si";
        ArrayList<Alumno> alumnes = new ArrayList();

        while (decision.equalsIgnoreCase("Si")) {
            Alumno alum = new Alumno();
            System.out.println("Ingrese nombre del alumno");
            alum.setNombre(leer.next());

            ArrayList<Integer> Notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese las notas del alumno");
                Notas.add(leer.nextInt());
            }
            alum.setNotas(Notas);
            System.out.println("Desea crear otro alumno?");
            decision = leer.next();

            alumnes.add(alum);
        }
        for (Alumno aux : alumnes) {
            System.out.println(aux);
        }

        decision = "Si";
        double sumaNotas = 0;

        while (decision.equalsIgnoreCase("Si")) {
            System.out.println("Ingrese nombre del alumno para calcular su promedio");
            String nombre_alum = leer.next();

            for (Alumno aux : alumnes) {

                if (aux.getNombre().equalsIgnoreCase(nombre_alum)) {
                    for (int i = 0; i < 3; i++) {
                        sumaNotas+= aux.getNotas().get(i);
                    }
                }
            }
            System.out.println("El promedio del alumno " + nombre_alum + " es " + (sumaNotas / 3));
            sumaNotas = 0;
            System.out.println("Desea calcular el promedio de otro alumno?");
            decision = leer.next();
        }
        System.out.println("Gracias por utilizar el prgrama");
    }
}
