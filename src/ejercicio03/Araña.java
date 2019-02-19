package ejercicio03;

public class Araña extends Animal{
	
	private String nombre;

	
	public Araña (int numPatas) {
		super(numPatas);
		
		this.nombre="Araña";
	
	}

	public void comer() {
		
		System.out.println("come");
	}
	
	public String getNombre () {
		return nombre;
	}

}
