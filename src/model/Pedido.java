package model;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<LineaPedido> lineas;

    public Pedido() {

        lineas = new ArrayList<>();
    }

    public void agregarLinea(LineaPedido linea) {

        lineas.add(linea);
    }

    public double calcularTotal() {

        double total = 0;

        for (LineaPedido linea : lineas) {

            total += linea.calcularSubtotal();
        }

        return total;
    }

    public ArrayList<LineaPedido> getLineas() {
        return lineas;
    }

    @Override
    public String toString() {

        StringBuilder detalle = new StringBuilder();

        detalle.append("\n===== PEDIDO =====\n");

        for (LineaPedido linea : lineas) {

            detalle.append(linea).append("\n");
        }

        detalle.append("-------------------\n");
        detalle.append("TOTAL: $").append(calcularTotal());

        return detalle.toString();
    }
}