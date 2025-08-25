package entities;

import java.util.Scanner;

public class Libro {
    // atributos o caracteristicas del objeto
    private int id = 0;
    private String titulo;
    private String autor;
    private double precio;
    private int copiasDisponibles;
    //constructores

    public Libro() {
    }

    public Libro(String titulo, String autor, double precio, int copiasDisponibles) {
        this.id = id += 1;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copiasDisponibles = copiasDisponibles;
    }

    //setter y getter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    //funciones o metodos
    Scanner scanner = new Scanner(System.in);

    //Un método que permita vender una cierta cantidad de copias de un libro, disminuyendo la cantidad disponible.
    // Si no hay suficientes copias, debe mostrar un mensaje indicando que la operación no es posible.
    public String venderCopias(int cantidadDeCopiasAVender) {
        int contador=0;
        if (copiasDisponibles >= cantidadDeCopiasAVender) {
            copiasDisponibles -= cantidadDeCopiasAVender;
            contador+=1;
        } else {
            System.out.println("la operacion no es posible");
        }
        String cantidadVentas="esta es la venta numero"+contador;

       return cantidadVentas;
    }

    public String incrementarCantidadDeCopiasDisponiblesEnElInventario() {
        int contador=0;
        contador+=1;

        String totalIncrementos = "numero de incremento de copias realizado:"+contador;
        System.out.println("ingrese la cantidad de copias a incrementar en el inventario");
        int incrementoDeCopias = scanner.nextInt();
        scanner.nextLine();
        copiasDisponibles +=incrementoDeCopias;


        return totalIncrementos;
    }
    public String printeoDatosLibro(){
        String datosLibro="Libro[id:"+id+"],[autor:"+autor+"],[precio:"+precio+"],[copias:"+copiasDisponibles+"]";
       return datosLibro;

    }


}