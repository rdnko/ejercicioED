package ejercicio03;

public class Ara�a extends Animal{
	
	private String nombre;

	
	public Ara�a (int numPatas) {
		super(numPatas);
		
		this.nombre="Ara�a";
	
	}

	public void comer() {
		
		System.out.println("come");
	}
	
	public String getNombre () {
		return nombre;
	}

}
