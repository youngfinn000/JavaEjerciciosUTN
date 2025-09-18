import java.util.LinkedList;

public class Tienda {
    private LinkedList<Libro>lista;


    public Tienda() {this.lista = new LinkedList<>();}

    ///metodos
    public String agregar(Libro aux){
        String mensaje="error";
        if (aux!=null){
            lista.add(aux);
            mensaje="carga Exitosa";
        }
        return mensaje;
    }
    public String eliminar(Libro aux){
        String mensaje="error";
        if (aux!=null){
            lista.remove(aux);
            mensaje="dato eliminado";
        }
        return mensaje;
    }
    public String mostrarTodo() {
        String mensaje = "";
        for (Libro aux : lista) {
            mensaje += aux.toString() + "\n";
        }
        return mensaje;
    }
    public int obtenerPos(String titulo){
        Libro aux = new Libro();
        aux.setTitulo(titulo);
        int pos = lista.indexOf(aux);
        return pos;
    }

    public Libro buscarPorTitulo (String titulo ){
        int pos = obtenerPos(titulo);
        return lista.get(pos);
    }

    public void actualizarPrecio(String titulo, double precio){
        int pos = obtenerPos(titulo);
        Libro aux = new Libro();
        aux = lista.get(pos);
        aux.setPrecio(precio);
        lista.set(pos, aux);
    }

    public double precioTotal(){
        double total = 0;
        for(Libro librito : lista){
            total += librito.getPrecio();
        }
        return total;
    }

    public int contarTotal(){
        return lista.size();
    }

    public Libro obtenerMasCaro(){
        Libro masCaro = new Libro();
        masCaro = lista.get(0);
        for(Libro aux : lista){
            if(aux.getPrecio() > masCaro.getPrecio()){
                masCaro = aux;}
        }
        return masCaro;
    }
    public Libro obtenerMasBarato(){
        Libro masBarato = new Libro();
        masBarato = lista.get(0);
        for(Libro librito : lista){
            if(librito.getPrecio() < masBarato.getPrecio()){
                masBarato = librito;
            }
        }
        return masBarato;
    }







}
