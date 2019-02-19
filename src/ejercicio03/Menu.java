package ejercicio03;

import Utilidades.Entrada;

public class Menu {

	private Animal[] catalogo;

	public Menu() {

		catalogo = new Animal[5];

	}

	public void agregarAnimal(Animal animal) {

		boolean encontrado = false;

		for (int i = 0; i < catalogo.length && !encontrado; i++)
			if (catalogo[i] == null) {
				catalogo[i] = animal;
				encontrado = true;
			}

		if (encontrado)
			System.out.println("Se ha añadido el animal");
		else
			System.out.println("El catalogo está lleno");
	}

	public void borrarAnimal(int identificador) {

		boolean encontrado = false;

		for (int i = 0; i < catalogo.length && !encontrado; i++)

			if (catalogo[i] != null && i == identificador) {
				System.out.println("Animal Borrado");

				catalogo[i] = null;

				encontrado = true;

				for (int j = i; j < catalogo.length - 1 && catalogo[j] != null; j++)

					catalogo[j - 1] = catalogo[j];
			} else
				System.out.println("Animal no encontrado");
	}

	public void modificarAnimal(int identificador) {

		String nombre = "";
		boolean encontrado = false;

		Gato gato;
		Pez pez;

		for (int i = 0; i < catalogo.length && !encontrado; i++)

			if (catalogo[i] != null && i == identificador) {
				System.out.println("Cual es el nombre nuevo?");

				nombre = Entrada.cadena();

				if (catalogo[i] instanceof Gato) {
					gato = (Gato) catalogo[i];
					gato.setNombre(nombre);
					System.out.println("Nombre cambiado");
				}

				if (catalogo[i] instanceof Pez) {
					pez = (Pez) catalogo[i];

					pez.setNombre(nombre);
					System.out.println("Nombre cambiado");
				}
				
				if (catalogo[i] instanceof Araña) {
					System.out.println("No se le puede cambiar el nombre");;
				}
				encontrado = true;

			} else
				System.out.println("Animal no encontrado");
	}

	public String mostrarAnimales() {

		int contGato = 0, contPez = 0, contAraña = 0;

		boolean encontrado = false;
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] != null && catalogo[i] instanceof Gato) {
				contGato++;
			}
			if (catalogo[i] != null && catalogo[i] instanceof Pez) {
				contPez++;
			}
			if (catalogo[i] != null && catalogo[i] instanceof Araña) {
				contAraña++;
			}

			encontrado = true;
		}
		if (!encontrado)
			return "No hay animales en el catalogo";

		return "Hay " + contGato + " gatos en el catalogo.\nHay " + contPez + " en la tienda.\nHay " + contAraña
				+ " en la tienda.";

	}

	public void mostrarAnimales2() {

//		Gato gato;
//		Pez pez;
//		Araña araña;

		boolean encontrado = false;
		for (int i = 0; i < catalogo.length; i++) {

			if (catalogo[i] != null) {
				// gato = (Gato) catalogo [i];
				System.out.println("El numero " + i + " es " + catalogo[i].getNombre());
//			}
//			if (catalogo[i] != null && catalogo[i] instanceof Pez) {
//				pez = (Pez) catalogo [i];
//				System.out.println("El numero "+i+" es "+pez.getNombre());
//			}
//			if (catalogo[i] != null && catalogo[i] instanceof Araña) {
//				araña = (Araña) catalogo [i];
//				System.out.println("El numero "+i+" es "+araña.getNombre());
//			}
				encontrado = true;
			}
		}
		if (!encontrado)
			System.out.println("No hay animales");

	}

}
