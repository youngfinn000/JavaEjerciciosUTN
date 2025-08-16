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

        // ejercicio 12
        // promedio de un arreglo de números enteros.
        // Realizar variantes con arreglos ya inicializados e ingreso por teclado.
        /*
        int [] arregloDeNumerosXTeclado = new int[5];
        int [] arregloInicializado = {7,7,7,7,7};

        // Cargar arreglo por teclado
        for (int i = 0; i < arregloDeNumerosXTeclado.length; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            arregloDeNumerosXTeclado[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Mostrar arreglo ingresado
        System.out.println("Arreglo cargado desde teclado:");
        for (int i = 0; i < arregloDeNumerosXTeclado.length; i++) {
            System.out.println("Posición " + i + ": " + arregloDeNumerosXTeclado[i]);
        }

        // Mostrar arreglo inicializado
        System.out.println("\nArreglo inicializado por código:");
        for (int i = 0; i < arregloInicializado.length; i++) {
            System.out.println("Posición " + i + ": " + arregloInicializado[i]);
        }

        int totalArreglo2 = 0;
        for(int i = 0; i < arregloInicializado.length ; i++) {
            totalArreglo2 += arregloInicializado[i];
        }
        int promedioArreglo2 =0;
        promedioArreglo2=totalArreglo2/arregloInicializado.length;
        System.out.println("total del arrego :" + totalArreglo2);
        System.out.println("promedio del arreglo : " + promedioArreglo2);

         */

        /*
        // ejercicio 13
        System.out.println("ingrese un numero: ");
        int summaNaturales = scanner.nextInt();
        scanner.nextLine();
        System.out.println("suma de naturales hasta el num ingresado:");
        int total = 0;
        for (int i = 1; i <= summaNaturales; i++) {
            System.out.println(total + "+" + i );
           total += i;
            System.out.println(total);
        }
         */
        // ejercicio 14
        //Realizar un programa Java que lea por teclado 20 temperaturas correspondientes a un mes
        //y calcule el máximo, el mínimo y el promedio. Utilizar un array double.

        double[] arregloTemperaturas = new double[10];
        for (int i = 0; i < arregloTemperaturas.length; i++) {
            System.out.println("ingrese una temperatura para la posicion [" + i + "]");
            arregloTemperaturas[i] = scanner.nextDouble();
        }
        System.out.println("arreglo cargado ");
        for (int i = 0; i < arregloTemperaturas.length; i++) {
            System.out.print("[" + arregloTemperaturas[i] + "]");
        }
        System.out.println();

        double maximo = arregloTemperaturas[0];
        double minimo = arregloTemperaturas[0];
        double promedio = 0;
        double total = 0;

        for (int i = 0; i < arregloTemperaturas.length; i++) {
            total += arregloTemperaturas[i];
            if (maximo < arregloTemperaturas[i]) {
                maximo = arregloTemperaturas[i];
            }
            if (minimo > arregloTemperaturas[i]) {
                minimo = arregloTemperaturas[i];
            }

        }

        System.out.println("maximo: " + maximo + ",minimo: " + minimo + ",total: " + total);

        promedio = total / (double) arregloTemperaturas.length;
        System.out.println("promedio de temperaturas:" + promedio);

    }
}









