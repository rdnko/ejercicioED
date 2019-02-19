package ejercicio03;


public abstract class Animal {
	
	private int numPatas;
	
	public Animal (int patas) {
		this.numPatas=patas;
	}
	
	public String caminar () {
		return "Este animal camina sobre "+numPatas+" patas.";
	}
	
	public abstract void comer ();
	
	public abstract String getNombre();
	


}
