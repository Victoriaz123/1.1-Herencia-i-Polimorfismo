package n1exercici1;

public class Viento extends Instrument{
	
	
	public Viento(String nombre,double precio) {
		super(nombre,precio);
	}
	
	
	 public String tocar() {
	       return "Esta sonando un instrumento de viento: " + getNombre();
	    }
}
