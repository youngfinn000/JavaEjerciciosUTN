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

    public double calcularSalarioAnual() {
        double salarioAnual = salario * 12;
        System.out.println("salario anual estimado de: " + salarioAnual);
        return  salarioAnual;
    }

    public String aumentarSalarioPorPorcentaje(double porcentajeAaumentar) {
        String mensaje;
        if (porcentajeAaumentar > 1) {
            mensaje="error: valor invalido, ingrese un numero con coma entre 0 y 1";
        } else {
            salario += salario * porcentajeAaumentar;
           mensaje="salario incrementado";
        }
        return mensaje;
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
    public String mostrarEmpleado() {
        String texto ="Datos de empleado["+dni+"],"+"["+nombre+"],"+"["+apellido+"],"+"["+salario+"]\n";
        return  texto;
    }

}
