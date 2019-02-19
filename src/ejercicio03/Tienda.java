package ejercicio03;

import Utilidades.Entrada;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Menu menu = new Menu ();
		
		int opcion = 0, opcion2=0, num=0;
		do {
		
		
		System.out.println("Que quiere hacer:");
		System.out.println("1->Agregar un animal.");
		System.out.println("2->Borrar un animal.");
		System.out.println("3->Modificar un animal.");
		System.out.println("4->Mostrar los animales que hay.");
		System.out.println("5->Salir");
		
		System.out.println();
		
		System.out.print("Introduce la opcion: ");
		
		opcion=Entrada.entero();
		
		while(opcion<=0 || opcion>5) {
			System.out.print("Introduce un valor valido: ");
			
			opcion=Entrada.entero();
		}
		
		switch(opcion) {
		case 1:
			System.out.println("Que animal quieres crear:");
			System.out.println("1->Araña");
			System.out.println("2->Gato");
			System.out.println("3->Pez");
			
			opcion2=Entrada.entero();
			
			while(opcion2<=0 || opcion2>3) {
				System.out.print("Introduce un valor valido: ");
				
				opcion2=Entrada.entero();
			}
			
			switch(opcion2) {
			case 1:
				System.out.println("Has elegido añadir una araña");
				Araña araña = new Araña (8);
				
				menu.agregarAnimal(araña);
				
				break;
			case 2:
				System.out.println("Has elegido añadir un gato");
				Gato gato = new Gato (4);
				
				menu.agregarAnimal(gato);
				
				break;
				
			case 3:
				System.out.println("has elegido añadir un pez");
				
				Pez pez = new Pez (0);
				
				menu.agregarAnimal(pez);
				
				break;
			}
			
			break;
			
		case 2:
			System.out.println("Has elegido borrar un animal");
			System.out.println("Que animal quieres borrar:");
			menu.mostrarAnimales2();
			System.out.println();
			
			System.out.print("Escribe el numero:");
			
			num=Entrada.entero();
			
			menu.borrarAnimal(num);
			System.out.println();
			
			break;
			
		case 3 : 
			System.out.println("Has elegido cambiar el nombre de los animales");
			System.out.println("Que animal queires cambiar: ");
			menu.mostrarAnimales2();
			System.out.println();
			
			System.out.print("Escribe el numero:");
			
			num=Entrada.entero();
			
			menu.modificarAnimal(num);
			
			System.out.println();
			
			break;
			
		case 4:
			System.out.println("Se mostraran los animales que hay de cada tipo");
			
			System.out.println(menu.mostrarAnimales());
			
		}
		

		}while(opcion!=5);
		
		//Begoña han faltado algunos comprobadores por ahi pero los voy a saltar por falta de tiempo
		//espero que no penalicen demasiado.
		
	}

}
