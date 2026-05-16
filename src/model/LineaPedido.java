package model;

public class LineaPedido {

    private Producto producto;
    private int cantidad;

    public LineaPedido(Producto producto, int cantidad) {

        this.producto = producto;
        setCantidad(cantidad);
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad debe ser mayor a 0"
            );
        }

        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {

        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {

        return producto.getTitulo() +
                " | Cantidad: " + cantidad +
                " | Subtotal: $" + calcularSubtotal();
    }
}