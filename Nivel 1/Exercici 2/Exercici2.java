package n1exercici2;

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Coche.frenar();
		
		Coche coche1 = new Coche("306CV");
		
		
        System.out.println("Marca: " + Coche.getMarca()); 
        System.out.println("Modelo: " + Coche.getModelo()); 
        System.out.println("Potencia: " + coche1.getPotencia()); 

		
		coche1.accelerar();
		
	
		
	}	
		
}


