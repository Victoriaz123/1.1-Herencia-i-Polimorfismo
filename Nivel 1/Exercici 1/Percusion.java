package n1exercici1;

public class Percusion extends Instrument{

	
	public Percusion(String nombre,double precio) {
		super(nombre,precio);
	}
	

	 public String tocar() {
	        return "Esta sonando un instrumento de percusion: " + getNombre();
	    }
}
