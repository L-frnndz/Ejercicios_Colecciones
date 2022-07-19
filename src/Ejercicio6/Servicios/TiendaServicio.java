package Ejercicio6.Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    public void Menu() {
        int opcion = 1;
        HashMap<String, Integer> Productos = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("----MENU----");
            System.out.println("1.Crear producto");
            System.out.println("2.Modificar producto");
            System.out.println("3.Eliminar producto");
            System.out.println("4.Mostrar productos");
            System.out.println("5.Salir");
            System.out.println("Que opcion desea elegir?");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Productos = crearProductos(Productos);
                    break;
                case 2:
                    System.out.println("Que producto desea modificar?");
                    String nombreProducto = leer.next();
                    if (Productos.containsKey(nombreProducto)) {
                        System.out.println("Ingrese nuevo precio del producto");
                        Integer precioProducto = leer.nextInt();
                        Productos.replace(nombreProducto, precioProducto);
                    } else {
                        System.out.println("No se encontro el producto");
                    }
                    break;
                case 3:
                    System.out.println("Que producto desea eliminar?");
                    nombreProducto = leer.next();
                    if (Productos.containsKey(nombreProducto)) {
                        System.out.println("El producto se elimino");
                        Productos.remove(nombreProducto);
                    }
                    break;
                case 4:
                    for (Map.Entry<String, Integer> entry : Productos.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        System.out.println("Producto: " + key + " valor: " + value);
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta. Ingrese nuevamente");
            }
        } while (opcion != 5);
        System.out.println("Gracias por usar el programa!");
    }

    public HashMap<String, Integer> crearProductos(HashMap<String, Integer> Productos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingrese el valor del producto");
        Integer precio = leer.nextInt();
        Productos.put(nombre, precio);

        return Productos;
    }

}
