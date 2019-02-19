package ejercicio02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
	
	private String nombre,Nif;
	private int edad;
	
	public Persona(String nombre, String nif, int edad) {
		this.nombre = nombre;
		Nif = nif;
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNif(String nif) {
		Nif = nif;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getNif() {
		return Nif;
	}

	public int getEdad() {
		return edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", Nif=" + Nif + ", edad=" + edad + "]\n";
	}
	
	public String compruebaNif (String nif) {
		
		boolean valido;
		
		Pattern p = Pattern.compile("^[0-9]{8}[A-Z]"); // patron

		Matcher m = p.matcher(nif); // fuente
		
		valido=m.matches();
		
		if (valido) {

			if(this.Nif.charAt(8)==compruebaLetra()) {
				return "Todo está en orden";
			}else {
				return "La letra no coincide";
			}
			
			
		}else {
			return "Has introducido mal el nif, escribe otro";
		}
		
	}
	
	public char compruebaLetra () {
		
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		
		int operacion = 0, nifEnt=0;
		
		char letraF = ' ';
		
		String dni = "";
		
		dni=Nif.substring(0,7);
		
		nifEnt = Integer.parseInt(dni);
		
		operacion =nifEnt % 23; // la operacion para obtener la letra
		
		letraF = letras[operacion];
		
		return letraF;
		
	}

}

