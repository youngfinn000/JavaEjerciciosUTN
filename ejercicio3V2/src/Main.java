import Entities.BankAccount;
import Entities.Empleado;

public class Main {
    public static void main(String[] args) {
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
        double balanceMain=cuentaBanco01.Credito(2500);
        System.out.println(balanceMain);
        System.out.println("debit\n");
        balanceMain=cuentaBanco01.debito(1500);
        System.out.println(balanceMain);
        System.out.println("debit invalido\n");
        balanceMain=cuentaBanco01.debito(30000);
        System.out.println(balanceMain);

        String datos1 = cuentaBanco01.mostrarDatosBancarios();
        System.out.println(datos1);

    }
}