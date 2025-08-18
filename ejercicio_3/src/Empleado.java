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



    /// METODOS
    public void nombreMetodo() {

    }

    public void calcularSalarioAnual(double salario) {
        double salarioMensual = salario*12;
        System.out.println("salario mensual estimado de: "+ salarioMensual);
    }

    public void aumentarSalarioPorPorcentaje(double porcentajeAaumentar){
        salario=salario*double
    }

}
