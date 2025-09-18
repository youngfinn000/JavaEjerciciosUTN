import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private Double precio;
    private int anioPublicado;

    public Libro(String titulo, String autor, int anioPublicado, Double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicado = anioPublicado;
        this.precio = precio;
    }

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.precio = 0.0;
        this.anioPublicado = 0;
    }

    /// inicio getter y setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getAnioPublicado() {
        return anioPublicado;
    }

    public void setAnioPublicado(int anioPublicado) {
        this.anioPublicado = anioPublicado;
    }
    /// fin getter y setter
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", anioPublicado=" + anioPublicado +
                '}';
    }
}
