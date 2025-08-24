import Entities.BankAccount;
import Entities.Empleado;
import Entities.ItemVenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        //1
        Empleado segundo = new Empleado();
        //A
        Empleado A = new Empleado("23.456.345", "Carlos", "Gutiérrez", 25000);
        //B
        Empleado B = new Empleado("34234123", "Ana", "Sánchez", 27500);
        //segundo.cargarEmpleadoXConsola();

        //C
        String mensajeA = A.mostrarEmpleado();
        String mensajeB = B.mostrarEmpleado();
        System.out.println(mensajeA + mensajeB);
        //D
        String mensajeD = A.aumentarSalarioPorPorcentaje(0.15);
        System.out.println(mensajeD);
        double salarioAnualA = A.calcularSalarioAnual();
        //2

        //C
        BankAccount cuentaBanco01 = new BankAccount("01", "killua", 15000);
        System.out.println("credit\n");
        double balanceMain = cuentaBanco01.Credito(2500);
        System.out.println(balanceMain);
        System.out.println("debit\n");
        balanceMain = cuentaBanco01.debito(1500);
        System.out.println(balanceMain);
        System.out.println("debit invalido\n");
        balanceMain = cuentaBanco01.debito(30000);
        System.out.println(balanceMain);

        String datos1 = cuentaBanco01.mostrarDatosBancarios();
        System.out.println(datos1);
*/
        ///3
        //En el main, realiza las siguientes operaciones dentro de un switch:
        //    1. Agregar ítem: Inicializa un objeto ItemVenta con valores proporcionados por el usuario.
        //    2. Imprime el objeto usando el método correspondiente.
        //    3. Permite al usuario ingresar una nueva cantidad y actualiza el atributo cantidad del ítem de venta.
        //    4. Permite al usuario ingresar un nuevo precio unitario y actualiza el atributo precioUnitario del ítem de venta.
        //    5. Imprime el precio total calculado por el método calcularPrecioTotal().
        //    6. Sale del programa.

        ItemVenta prueba=new ItemVenta();
        int caso = 0;

        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Opción 1 Agregar ítem");
            System.out.println("2. Opción 2 mostrar");
            System.out.println("3. Opción 3 cambiar cantidad");
            System.out.println("4. Opción 4 cambiar precio unitario");
            System.out.println("5. Opción 5");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            caso=sc.nextInt();
            sc.nextLine();


            switch (caso) {
                case 1:
                    System.out.println("ingrese un id");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese la descripcion");
                    String descripcion=sc.nextLine();
                    System.out.println("ingrese la cantidad");
                         int   cantidad =sc.nextInt();
                         sc.nextLine();
                    System.out.println("ingrese el precio");
                           double precio=sc.nextDouble();


                     prueba=new ItemVenta(id,descripcion,cantidad,precio);

                    break;
                case 2:
                    String producto1 =prueba.mostrarProducto();
                    System.out.println(producto1);
                    break;
                case 3:
                    System.out.println("ingresar nueva cantidad:");
                    int reajuste=sc.nextInt();
                    sc.nextLine();
                    prueba.setCantidad(reajuste);
                    break;
                case 4:
                    System.out.println("reingresar precio unitario:");
                    double preciou=sc.nextDouble();
                    prueba.setPrecioUnitario(preciou);
                    break;
                case 5:
                    double preciototal=prueba.calcularPrecioTotal();
                    System.out.println(preciototal);
                    break;
                default:
                    System.out.println("error ");
                    break;
            }

        } while (caso != 6);


    }
}