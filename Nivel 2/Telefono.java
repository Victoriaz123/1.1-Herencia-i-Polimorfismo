public class Telefono {

    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void llamar(int numero){
    System.out.println("Estas llamando al numero "+ numero);
    }
}
