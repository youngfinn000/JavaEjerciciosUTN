package entities;

import java.util.Scanner;

public class Libro {
    ///caracteristicas
    private String titulo;
    private double precio;
    private int stok;
    private Autor autor;
    //constructores

    public Libro() {
    }

    public Libro(String titulo, double precio, int stok, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stok = stok;
        this.autor = autor;
    }
    /// getter y setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    ///metodos
public String printLibro (){
        return ("Datos del siguiente Libro" +
                "\nTitulo:" +titulo
                +"\nprecio:"+precio+"\nstock:"+stok+"\nautor"+autor.getNombre()+autor.getApellido());
}
public void aumentoCopiasLibro(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("ingrese la cantidad de libros a aumentar en stock:");
    int aumento=scanner.nextInt();
    scanner.nextLine();
stok+=aumento;
    System.out.println("se incremento la cantidad de libros a:"+stok+"\nstock anterior de "+(stok-aumento));
}
public String MostrarDatosAutor(){
        return (autor.mostrarAutor());
}
public String mensajito(){
        return ("El libro,"+titulo+"de"+autor+" se vende a "+precio+"pesos");
}



}
