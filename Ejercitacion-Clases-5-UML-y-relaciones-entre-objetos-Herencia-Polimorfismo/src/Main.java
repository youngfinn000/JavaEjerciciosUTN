import entities.Autor;
import entities.Libro;
import ventasLocal.Cliente;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// inicio main
        Scanner scanner = new Scanner(System.in);
        /*
        //1A
        Autor primerAutor=new Autor( "Joshua", "Bloch", "joshua@email.com", 'M');
        //B
        System.out.println(primerAutor.mostrarAutor());
        //C
        Libro libroProgramacion = new Libro("Efective Java",450,150,primerAutor);
        //D
        System.out.println(libroProgramacion.printLibro());
        //E
        libroProgramacion.setPrecio(500);
        libroProgramacion.aumentoCopiasLibro();
        //F
        System.out.println(libroProgramacion.MostrarDatosAutor());
        //G
        System.out.println(libroProgramacion.mensajito());
        */

        Cliente firstOne = new Cliente("wasd","awd",0.25);
        String idSinGuiones=firstOne.getId().replace("-","");
        System.out.println(idSinGuiones);





    }
}