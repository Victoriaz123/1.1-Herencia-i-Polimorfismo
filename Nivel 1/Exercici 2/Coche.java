package n1exercici2;

public class Coche {

	private static final String marca = "Toyota";
	private static String modelo = "Rav 4";
	private final String potencia;
	
	public Coche (String potencia) {
		this.potencia=potencia;
	}
	
    
    public static String getMarca() {
        return marca;  
    }

    public static String getModelo() {
        return modelo;
    }

    public String getPotencia() {
        return potencia;
    }
	
    
	public static void frenar() {    
		System.out.println("El vehiculo esta frenando");
	}
	
	public void accelerar() {   
		System.out.println("El vehiculo esta accelerando");
	}
	

}
