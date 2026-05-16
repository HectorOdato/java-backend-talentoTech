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
    public boolean eliminarProducto(int id) {

        Producto producto = buscarPorId(id);

        if (producto != null) {
            productos.remove(producto);
            return true;
        }
        return false;
    }

    public boolean actualizarProducto(int id, double nuevoPrecio, int nuevoStock) {

    Producto producto = buscarPorId(id);

    if (producto != null) {

        producto.setPrecio(nuevoPrecio);
        producto.setStock(nuevoStock);

        return true;
    }
    return false;
}

}
