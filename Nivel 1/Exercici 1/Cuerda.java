package n1exercici1;

public class Cuerda extends Instrument {

	
	public Cuerda(String nombre,double precio) {
		super(nombre,precio);
	}
	
	
	 public String tocar() {
	        return "Esta sonando un instrumento de cuerda: " + getNombre();
	    }
}
