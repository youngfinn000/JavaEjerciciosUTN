package ventasLocal;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.UUID;

public class Factura {
    //representa una venta del local
    ///atributos
    private String id;
    private double montoTotal;
    private String fecha;
    private Cliente cliente;

    //constructores

    public Factura() {
    }

    public Factura(double montoTotal, Cliente cliente) {
        //this.id = generarId();
        this.id= UUID.randomUUID().toString();
        this.montoTotal = montoTotal;
        this.fecha =LocalDateTime.now().toString();
        this.cliente = cliente;
    }
//getter y setter
    public String getId() {
        return id;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public String getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //metodos
    /*
    private String generarId(){
        String caracteres="poiuytrewqñlkjhgfdsamnbvcxz0987654321";
        StringBuilder sb=new StringBuilder();
        Random random =new Random();
        int longitud=8;
        for (int i=0;i<longitud;i++){
            int index=random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        return sb.toString();
    }
*/












}
