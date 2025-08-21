package Entities;

public class BankAccount {
    ///ATRIBUTOS
    String id;
    String nombre;
    double balance;

    ///CONSTRUCTORES

    public BankAccount() {
    }

    public BankAccount(String id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }
    ///SET Y GET
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    ///METODOS
    ///a. El método crédito que representa un depósito de dinero en la cuenta. Este método debe devolver el balance luego de la operación.
    public double Credito(double deposito){
        balance+=deposito;
        return balance;
    }
    //b. El método débito que representa una sustracción de dinero de la cuenta. Este método debe devolver el balance luego de la operación.
    // Si el dinero en la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por pantalla un aviso sin permitir dicha sustracción.

    public  double debito(double sustraccion){
        if (balance >= sustraccion){
            balance-=sustraccion;
        }
        else {
            System.out.println("no hay saldo suficiente");
        }
        return  balance;
    }

    public String mostrarDatosBancarios(){
        String datos=("datos bancarios: id:"+id+"\nnombre:"+nombre+"\nbalance:"+balance);
        return datos;
    }






}
