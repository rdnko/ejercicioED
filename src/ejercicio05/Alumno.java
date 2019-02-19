package ejercicio05;

public class Alumno {
	
	private static int generaId = 1;

	private String nombre;

	private double nota1, nota2, nota3;
	
	private int id=0;

	public Alumno(String nombre, double nota1, double nota2, double nota3) {

		this.nombre = nombre;

		this.nota1 = nota1;

		this.nota2 = nota2;

		this.nota3 = nota3;
		
		id=generaId++;

	}

	// seters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNota1(double nota) {
		this.nota1 = nota;
	}

	public void setNota2(double nota) {
		this.nota2 = nota;
	}

	public void setNota3(double nota) {
		this.nota3 = nota;
	}

	// getters

	public String getNombre() {
		return nombre;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getNota3() {
		return nota3;
	}
	
	public int getId ()	{
		return id;
	}

	// toString

	public String toString() {
		return "El nombre del alumno es " + nombre + ".\nLa nota del primer trimestre es " + nota1 + ".\n"
				+ "La nota del segundo trimestre es " + nota2 + ".\nLa nota del tercer trimestre es " + nota3 + ".";
	}
	
	

}
