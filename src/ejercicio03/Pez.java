package ejercicio03;

public class Pez extends Animal implements Mascota {

	private String nombre;

	public Pez(int numPatas) {
		super(numPatas);

		this.nombre = "Pez";

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void jugar() {
		System.out.println("juega");
	}

	public void comer() {

		System.out.println("come");
	}

}
