package ejercicio05;

import Utilidades.Entrada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		double nota1, nota2, nota3;

		String nombre;

		Menu menu = new Menu();

		System.out.println("Bienvenido que quiere hacer:");

		do {

			System.out.println("1->Añadir alumnos");
			System.out.println("2->Ver media de cada alumno indivifualmente");
			System.out.println("3->Media de todo el curso");
			System.out.println("4->Media de cada evaluacion");
			System.out.println("5->salir");

			opcion = Entrada.entero();

			while (opcion <= 0 || opcion > 5) {
				System.out.println("Introduzca un valor de las opciones");

				opcion = Entrada.entero();
			}

			switch (opcion) {

			case 1:
				System.out.println("Ha elegido añadir alumnos");

				System.out.print("Diga el nombre del alumno: ");
				nombre = Entrada.cadena();
				System.out.println();

				System.out.print("Diga su nota de la primera evaluacion: ");

				nota1 = Entrada.real();

				while (nota1 < 0 || nota1 > 10) {
					System.out.println("Introduce una nota valida");
					nota1 = Entrada.real();
				}
				System.out.print("Diga su nota de la segunda evaluacion: ");

				nota2 = Entrada.real();

				while (nota2 < 0 || nota2 > 10) {
					System.out.println("Introduce una nota valida");
					nota2 = Entrada.real();
				}
				System.out.print("Diga su nota de la tercera evaluacion: ");

				nota3 = Entrada.real();

				while (nota3 < 0 || nota3 > 10) {
					System.out.println("Introduce una nota valida");
					nota3 = Entrada.real();
				}

				Alumno alumno = new Alumno(nombre, nota1, nota2, nota3);

				menu.agregarAlumno(alumno);
				
				break;
				
			case 2:
				System.out.println("Ha elegido ver la media de cada alumno");
				System.out.println();
				menu.mediaAlumnos();
				
				break;
				
			case 3:
				System.out.println("Ha elegido ver la media de todos los alumnos");
				
				double media = menu.media();
				
				System.out.println("La media de todo el curso es "+media);
				
				break;
			case 4:
				System.out.println("ha elegido ver la media de cada evaluacion");
				
				menu.mediaEvaluacion();

			}
			
			System.out.println();
			
				

		} while (opcion != 5);

	}

}
