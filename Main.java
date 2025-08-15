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
        /*
        System.out.println("ingrese los km/hora:");
        int velocidadKm = scanner.nextInt();
        scanner.nextLine();
        int velocidadMS = velocidadKm * 1000 / 3600;
        System.out.println("Velocidad: " + velocidadKm + " km/h = " + velocidadMS + " m/s");
        */
        //ejercicio 8
        //Realizar un programa que lea por teclado
        //un número de 3 cifras y muestra sus cifras por separado.
        /*
        System.out.println("ingrese un numero de 3 cifras:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("numero ingresado[" + numero + "]");

        if (numero >= 100 && numero <= 999) {
            int centenas = numero / 100;
            int decenas = (numero / 10) % 10;
            int unidades = numero % 10;

            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);
        } else {
            System.out.println("El número ingresado no tiene 3 cifras.");
        }
*/
        /*
        //ejercicio 9 Realizar un programa que lea por teclado un número entero N
        // de 5 cifras y muestre las cifras que ocupan posiciones impares.
        System.out.println("ingrese un numero entero de 5 cifras");
        int N = scanner.nextInt();
        scanner.nextLine();
        System.out.println("numero cargado: " + N);

        if (N >= 10000 && N <= 99999) {
            int pos1 = N / 10000;          // primera cifra
            int pos3 = (N / 100) % 10;     // tercera cifra
            int pos5 = N % 10;             // quinta cifra

            System.out.println("Cifras en posiciones impares:");
            System.out.println("Posición 1: " + pos1);
            System.out.println("Posición 3: " + pos3);
            System.out.println("Posición 5: " + pos5);
        } else {
            System.out.println("El número no tiene 5 cifras.");
        }
        */

        //ejercicio 10
        //Realizar un programa que lea por teclado tres números enteros H, M, S
        // que contengan hora, minutos y segundos respectivamente,
        //y compruebe si la hora que indican es una hora válida.
        /*
        int H,M,S;
        System.out.println("ingrese la hora actual:");
        H = scanner.nextInt();
        System.out.println("ingrese el minuto actual:");
        M = scanner.nextInt();
        System.out.println("ingrese el segundo actual:");
        S = scanner.nextInt();
        scanner.nextLine();

        if(H >= 0 && H <= 24 && M >=0 && M <= 59 && S >=0 && S <= 59)
        {
            System.out.println("hora ingresada [" + H + ":" + M + ":" + S);
        }
        else{
            System.out.println("hora invalida");
        }
        */
        //ejercicio 11

        /*
        System.out.println("ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su edad:");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ingrese su salario:");
        int salario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nombre : "+ nombre);
        System.out.println("Edad : " + edad);
        if(edad < 16) {
            System.out.println("no tiene edad para trabajar");
        } else if (edad >= 16 && edad <=18) {
            System.out.println("Salario : " + salario);
        } else if (edad >= 19 && edad <= 50) {
            System.out.println("Salario : " + (salario += (salario/100)*5));
        } else if (edad >= 51 && edad <= 60) {
            System.out.println("Salario : " + (salario += (salario/100)*10));
        }else {
            System.out.println("Salario : " + (salario += (salario/100)*15));
        }

        */

    }
}









