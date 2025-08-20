import Entities.Empleado;

public class Main {
    public static void main(String[] args) {
        Empleado primero = new Empleado();
        Empleado segundo = new Empleado();
        segundo.cargarEmpleadoXConsola();
        segundo.mostrarEmpleado();

        primero.setDni("45.444.444");
        primero.setNombre("killua");
        primero.setApellido("zzz");
        primero.setSalario(1000.00);


        primero.mostrarEmpleado();
        System.out.println();
        primero.calcularSalarioAnual();
        primero.aumentarSalarioPorPorcentaje(0.1);
    }
}