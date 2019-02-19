package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		Persona per = new Persona ("Pedro", "12345678Z", 23);
		
		System.out.println(per.compruebaNif(per.getNif()));
	}

}
