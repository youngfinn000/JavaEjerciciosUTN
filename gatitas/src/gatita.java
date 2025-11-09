import java.lang.reflect.Array;
import java.util.ArrayList;

public class gatita {
    private String name;
    private String breed;
    private String color;
    private ArrayList<Kittens> gatitos;

    public gatita() {
    }

    public gatita(String name, String breed, String color, ArrayList<Kittens> gatitos) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gatitos = gatitos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Kittens> getGatitos() {
        return gatitos;
    }

    public void setGatitos(ArrayList<Kittens> gatitos) {
        this.gatitos = gatitos;
    }

    @Override
    public String toString() {
        return "gatita{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gatitos=" + gatitos +
                '}';
    }
}
