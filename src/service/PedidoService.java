package service;

import exception.StockInsuficienteException;
import model.LineaPedido;
import model.Pedido;
import model.Producto;

public class PedidoService {

    public Pedido crearPedido(
            Producto producto,
            int cantidad
    ) throws StockInsuficienteException {
        if (cantidad > producto.getStock()) {

            throw new StockInsuficienteException(
                    "Stock insuficiente para el libro: "
                            + producto.getTitulo()
            );
        }
        Pedido pedido = new Pedido();
        LineaPedido linea = new LineaPedido(
                producto,
                cantidad
        );
        pedido.agregarLinea(linea);
        producto.setStock(
                producto.getStock() - cantidad
        );
        return pedido;
    }
}