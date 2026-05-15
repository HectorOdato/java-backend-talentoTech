package main;

import model.Producto;
import service.ProductoService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductoService productoService = new ProductoService();

        int opcion;
        int idContador = 1;

        do {

            System.out.println("\n===== LIBRERÍA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");


            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();

                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();

                    Producto producto = new Producto(
                            idContador,
                            titulo,
                            autor,
                            precio,
                            stock
                    );

                    productoService.agregarProducto(producto);

                    System.out.println("Libro agregado correctamente.");

                    idContador++;

                    break;

                case 2:

                    productoService.listarProductos();

                    break;

                case 3:

                    System.out.print("Ingrese ID del libro: ");
                    int idBuscar = scanner.nextInt();

                    Producto encontrado = productoService.buscarPorId(idBuscar);

                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }

                    break;

                case 4:

                    System.out.println("Saliendo del sistema.");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}