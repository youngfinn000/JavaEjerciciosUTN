import java.util.Scanner;


//Scanner, Wrapper, String, Array
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Ejercicio 1
        /*
        int N;
        System.out.println("ingrese un numero entero para asignarle un valor a la variable N:");
        N = scanner.nextInt();
        scanner.nextLine();
        System.out.println("valor de N =" + N);
        N += 77;
        System.out.println("valor de N incrementado en 77 =" + N);
        int dupe = N;
        N = N - 3;
        System.out.println("valor de N reducido a 3=" + N);
        N += N;
        System.out.println(("valor de N duplicado=" + N));

         */
// --------------------------------------------------------
        // ejercicio 2
        /*
        int A;
        System.out.println("ingrese un valor de tipo entero:");
        A = scanner.nextInt();
        scanner.nextLine();

        String resultadoA = (A % 2 == 0) ? "Par" : "Impar";

        System.out.println("El número es: " + resultadoA);
*/
        //ejercicio 3
        /*
        int B;
        System.out.println("ingrese un numero negativo o positivo de tipo entero:");
        B = scanner.nextInt();
        scanner.nextLine();

 1       String resultadoB = (B<0)? "negativo" : "positivo";
        System.out.println("el numero es: " + resultadoB);
        */
        //ejercicio 4
        /*
        System.out.println("ingrese una letra:");
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("la letra ingresada es " + caracter);
        System.out.println("valor de la letra ingresada en ASCII ="+(int)caracter);
*/
        //ejercicio 5
        /*
        System.out.println("ingrese un numero entero:");
        int C = scanner.nextInt();
        scanner.nextLine();
        System.out.println("numero ingresado = " + C);
        //el valor de C es positivo o negativo?
        String positivoONegativo = (C<0)? " es negativo " : " es positivo ";
        // es par o impar?
        String parOImpar =(C%2==0)? "es par" : "es impar ";
        // es múltiplo de 5?
        String multiploDeCinco=(C%5==0)? "es multiplo de 5 " : "NO es multiplo de 5 ";
        // es múltiplo de 10?
        String multiploDeDiez=(C%10==0)? "es multiplo de 10 " : "NO es multiplo de 10 ";
        // es mayor o menor que 100.
        String MayorOMenorQueCien=(C > 100)? "si es mayor que 100 " : "no es mayor que 100 ";
        System.out.println("el numero " + C + positivoONegativo + parOImpar + multiploDeCinco + multiploDeDiez + MayorOMenorQueCien);
*/
        //ejercicio 6
        /*
        System.out.println("ingrese un nombre");
        String nombre=scanner.nextLine();
        System.out.println("buenos dias " + nombre);
        */

        //ejercicio 7
        //Cálculo: velocidadMS = velocidadKm * 1000 / 3600;
        System.out.println("ingrese los km/hora:");
        int velocidadKm = scanner.nextInt();
        scanner.nextLine();
        int velocidadMS = velocidadKm * 1000 / 3600;
        System.out.println("km por hora = " + velocidadKm + "ms por segundo = " + velocidadMS);
        










/*
Calculadora calculadora1 = new Calculadora();
int resultado =calculadora1.sumar(6,2);
System.out.println("Resultado de la suma:" + resultado);
*/
    }
}









