package Entities;

public class ItemVenta {
    //ATRIBUTOS
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    //CONSTRUCTORES
    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public ItemVenta() {
    }
    ///SETT Y GETT

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    ///METODOS
    public double calcularPrecioTotal() {
        double precioTotal = precioUnitario * cantidad;
        return precioTotal;
    }

    public String mostrarProducto(){
        double preciototal=calcularPrecioTotal();
        String printProducto=("ItemVenta:"+getId()+"\ndescripcion"+getDescripcion()+"\ncantidad"+getCantidad()+"\npTotal"+preciototal);
                return printProducto;
    }

}
