package entities;

public class Autor {
    ///atributos
    private String nombre;
    private String apellido;
    private String email;
    private char genero;
    ///constructor
    public Autor() {
    }

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }
    ///setter y getter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
 ///metodos
    public String mostrarAutor(){
        return ("Autor" +
                "\nNombre:"+nombre+
                "\nApellido:"+apellido+
                "\nEmail:"+email+
                "\ngenero:"+genero);
    }




}