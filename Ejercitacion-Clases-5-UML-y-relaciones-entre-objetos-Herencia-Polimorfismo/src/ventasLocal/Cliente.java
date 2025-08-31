package ventasLocal;

import java.util.Random;
import java.util.UUID;

public class Cliente {
    //atributos
    private String id;
    private String nombre;
    private String email;
    private double porcentajeDescuento;

    //constructores
    public Cliente() {
    }

    public Cliente(String nombre, String email, double porcentajeDescuento) {
       // this.id = generarId();
        this.id=UUID.randomUUID().toString();
        //String id = UUID.randomUUID().toString().replace("-", "");
        //.replace para quitar los guiones en caso de no quererlos

        this.nombre = nombre;
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    //getter y setter


    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
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
public String mostarCliente(){
    return (getId()+"");
}




}
