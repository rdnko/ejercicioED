package ejercicio03;

public class Gato extends Animal implements Mascota{
	
	private String nombre;

	
	public Gato (int numPatas) {
		super(numPatas);
		
		this.nombre="Gato";
	
	}
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void jugar () {
		System.out.println("juega");
	}


	public void comer() {
		
		System.out.println("come");
	}
}