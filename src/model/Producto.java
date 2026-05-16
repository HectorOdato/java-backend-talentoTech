package model;

public class Producto {

    private int id;
    private String titulo;
    private String autor;
    private double precio;
    private int stock;

public Producto(int id, String titulo, String autor, double precio, int stock) {

    this.id = id;

    setTitulo(titulo);
    setAutor(autor);
    setPrecio(precio);
    setStock(stock);
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {

    if (titulo == null || titulo.trim().isEmpty()) {
        throw new IllegalArgumentException("El título no puede estar vacío.");
    }

    this.titulo = titulo;
}
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {

    if (autor == null || autor.trim().isEmpty()) {
        throw new IllegalArgumentException("El autor no puede estar vacío.");
    }

    this.autor = autor;
}

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Título: " + titulo +
                " | Autor: " + autor +
                " | Precio: $" + precio +
                " | Stock: " + stock;
    }
}