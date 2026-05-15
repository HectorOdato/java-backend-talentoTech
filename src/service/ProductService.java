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


