package service;

import model.Producto;

import java.util.ArrayList;

public class ProductoService {

    private ArrayList<Producto> productos;

    public ProductoService() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public void listarProductos() {

        if (productos.isEmpty()) {
            System.out.println("No hay libros cargados.");
            return;
        }

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public Producto buscarPorId(int id) {

        for (Producto producto : productos) {

            if (producto.getId() == id) {
                return producto;
            }
        }

        return null;
    }

}
