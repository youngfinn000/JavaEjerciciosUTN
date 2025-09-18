//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear la tienda
        Tienda miTienda = new Tienda();

        // Crear los libros
        Libro libro1 = new Libro("sadw", "killua", 2020, 444.25);
        Libro libro2 = new Libro("dsaw", "gon", 1999, 132.50);
        Libro libro3 = new Libro("wasd", "kuroro", 2017, 231.75);

        // Agregar los libros a la tienda
        System.out.println(miTienda.agregar(libro1));
        System.out.println(miTienda.agregar(libro2));
        System.out.println(miTienda.agregar(libro3)+"\n");

        // Eliminar un libro
        System.out.println(miTienda.eliminar(libro1)+"\n");


        // Mostrar todos los libros
        String infoDeTodos = miTienda.mostrarTodo();
        System.out.println(infoDeTodos+"\n");
        // Buscar un libro por su titulo
        Libro libroBuscado = new Libro();
        libroBuscado = miTienda.buscarPorTitulo("wasd");
        // Actualizar el precio de un libro
        miTienda.actualizarPrecio("sadw", 200.25);
        System.out.println(miTienda.mostrarTodo());
        // Calcular precio total de todos los libros
        double total = miTienda.precioTotal();
        System.out.println("precio total de todos los libros: " + total+"\n");
        // Contar el numero total de libros
        int cantTotal = miTienda.contarTotal();
        System.out.println("cantidad total de libros: " + cantTotal+"\n");
        // Obtener libro mas caro
        Libro masCaro = new Libro();
        masCaro = miTienda.obtenerMasCaro();
        System.out.println("El libro mas caro es: " + masCaro.toString()+"\n");
        // Obtener libro mas barato
        Libro masBarato = new Libro();
        masBarato = miTienda.obtenerMasBarato();
        System.out.println("El libro mas barato es: " + masBarato.toString()+"\n");



        }
    }