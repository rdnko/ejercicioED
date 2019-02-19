package ejercicio01;

public class Ejercicio01 {

	public Ejercicio01() {

	}

	public static boolean busquedaBinaria(int[] vector, int buscado) {

		boolean encontrado = false;

		for (int i = 0; i < vector.length && !encontrado; i++) {

			if (vector[i] == buscado)
				encontrado = true;

		}

		return encontrado;

	}

	/*
	 * Yo haria este metodo como un metodo estatico para no tener que instanciar un
	 * objeto de la clase. No necesitas nada mas. Le pasas el array y el numero que
	 * buscas y te devuelve verdadero o falso si loe encuentra pero solo la primera
	 * posicion. Porque cuando lo encuentre sale del array.
	 * 
	 */
}
