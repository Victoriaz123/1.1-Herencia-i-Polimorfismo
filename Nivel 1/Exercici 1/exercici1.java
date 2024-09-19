package n1exercici1;

public class exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Instrument flauta = new Viento("Flauta", 50.00);
	     Instrument guitarra = new Cuerda("Guitarra", 77.50);
	     Instrument tambor = new Percusion("Percusion", 100.00);
	     
	     
	     System.out.println(flauta.tocar());
	     System.out.println(guitarra.tocar());
	     System.out.println(tambor.tocar());
	}

}
