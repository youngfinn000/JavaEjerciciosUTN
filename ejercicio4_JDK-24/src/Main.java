import entities.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        //Realizar un programa que lee por teclado el valor del radio de una circunferencia
        System.out.println("ingrese el valor del radio de una circunferencia");
        double radio1 = scanner.nextDouble();
        // calcula y muestra por pantalla la longitud y el área de la circunferencia
        //2 * PI * radio
        double longitud1 = 2 * Math.PI * radio1;
        // cálculo de área: PI * radio^2
        // Usar la clase Math
        double area1 = Math.PI * Math.pow(radio1, 2);
        System.out.println("radio:" + radio1);
        System.out.println("longitud:" + longitud1);
        System.out.println("area:" + area1);

        //2
        System.out.print("Ingrese la longitud del cateto 1: ");
        double cateto1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del cateto 2: ");
        double cateto2 = scanner.nextDouble();

        // Cálculo de la hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
        //3
        //calculo del volumen de una esfera
        System.out.print("Ingrese el valor del radio de la esfera: ");
        double radio = scanner.nextDouble();

        // Calcular volumen
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        // Mostrar resultado
        System.out.println("Radio: " + radio);
        System.out.println("Volumen de la esfera: " + volumen);


        //4 LIBRO
        //a
        Libro libro1 = new Libro("el quijote", "miguel de Cervantes", 500, 10);
        //b
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 700, 5);
        //c
        String datosLibro1 = libro1.printeoDatosLibro();
        String datosLibro2 = libro2.printeoDatosLibro();
        System.out.println(datosLibro1 + "\n" + datosLibro2);
        //d
        String totalVentasGeneral = libro1.venderCopias(3);
        System.out.println(totalVentasGeneral);
        datosLibro1 = libro1.printeoDatosLibro();
        //e
        System.out.println(datosLibro1);
        //f
        totalVentasGeneral = libro2.venderCopias(8);
        System.out.println(totalVentasGeneral);
        //g
        String totalIncrementoDeCopias = libro2.incrementarCantidadDeCopiasDisponiblesEnElInventario();
        //h
        datosLibro2 = libro2.printeoDatosLibro();
        System.out.println(datosLibro2);


    }
}