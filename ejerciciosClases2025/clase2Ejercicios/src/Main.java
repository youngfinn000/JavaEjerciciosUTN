import java.util.Scanner;


//Scanner, Wrapper, String, Array
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Ejercicio 1
        int N;
        System.out.println("ingrese un numero entero para asignarle un valor a la variable N:");
        N=scanner.nextInt();
        scanner.nextLine();
        System.out.println("valor de N ="+N);
        N+=77;
        System.out.println("valor de N incrementado en 77 ="+N);
        int dupe=N;
        N+=3-dupe;
        System.out.println("valor de N reducido a 3="+N);
        N+=N;
        System.out.println(("valor de N duplicado="+N));
// --------------------------------------------------------
        // ejercicio 2




/*
Calculadora calculadora1 = new Calculadora();
int resultado =calculadora1.sumar(6,2);
System.out.println("Resultado de la suma:" + resultado);
*/


//notas personales

        // operador ternario o condicional
        // (condicion)?valor1:valor2
        //int a=2>3?1:2;

        // sout=Snipet para System.out.println(
        //comentarios de documentacion
        /**
         * metodo suma de numeros
         * @param a primer numero a sumar
         * @param b segundo numero a sumar
         * @return suma de a y b
         */
       // public int sumar(int a, int b) {
        //    return a + b;
       // }

    }
    // Funciones


}









