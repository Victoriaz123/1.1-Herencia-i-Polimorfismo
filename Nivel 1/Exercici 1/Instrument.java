package n1exercici1;

public abstract class Instrument {
	
	  static {
	        System.out.println("Clase Instrumento cargada una vez.");
	    }

	private String nombre;
	private double precio;
	
	public Instrument(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	
	public abstract String tocar();
		
	
}
