package Entities;

import java.util.Scanner;

public class Empleado {
    ///ATRIBUTOS
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    ///CONSTRUCTORES
    public Empleado(String dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public Empleado() {

    }

    ///SETTER Y GETTER
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    /// METODOS
    public void nombreMetodo() {

    }

    public void calcularSalarioAnual() {
        double salarioMensual = salario * 12;
        System.out.println("salario mensual estimado de: " + salarioMensual);
    }

    public void aumentarSalarioPorPorcentaje(double porcentajeAaumentar) {
        if (porcentajeAaumentar > 1) {
            System.out.println("error: valor invalido");
        } else {
            System.out.println("salario sin aumento:" + salario);
            salario += salario * porcentajeAaumentar;
            System.out.println("salario con aumento del:" + porcentajeAaumentar + ":" + salario);
        }
    }

    public void cargarEmpleadoXConsola(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("carga de datos de un empleado:");
        System.out.println("ingrese el DNI del empleado ");
        dni = scanner.nextLine();
        System.out.println("ingrese el nombre del empleado ");
        nombre = scanner.nextLine();
        System.out.println("ingrese el apellido del empleado ");
        apellido = scanner.nextLine();
        System.out.println("ingrese el sueldo del empleado ");
        salario = scanner.nextDouble();

    }
    public void mostrarEmpleado() {
        System.out.print("Datos de empleado["+dni+"],"+"["+nombre+"],"+"["+apellido+"],"+"["+salario+"]");
        System.out.println();
    }

}
