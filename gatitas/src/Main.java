import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GestorGatita gestorGatita=new GestorGatita();

        ArrayList<gatita> gatasDelJSON = new ArrayList<>();

        gatasDelJSON=gestorGatita.archivoLista("cats.json");
        System.out.println(gatasDelJSON.toString());
    }


}