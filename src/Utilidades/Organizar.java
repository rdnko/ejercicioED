package Utilidades;

public class Organizar {

	public static void organizarInt(int[] aray) {

		int aux;

		for (int i = 0; i < aray.length; i++) 
			for (int j = i; j < aray.length; j++) {
				if (aray[j] < aray[i]) {
					aux = aray[i];
					aray[i] = aray[j];
					aray[j] = aux;
				}
			}

		}


	public static void mostrarInt(int[] aray) {

		for (int i = 0; i < aray.length; i++)
			System.out.print(aray[i]);

	}
	
	public static void organizarIntSeleccion (int [] aray) {
		int aux = 0,min=0;
		
		for(int i = 0; i<aray.length;i++) {
			
			min=i;
			
			
			for(int j = i+1; j < aray.length; j++ ) 
				if(aray[j]<aray[min]) 
					min=j;
			if (min!=i)
				aux=aray[i];
				aray [i]=aray[min];
				aray[min]=aux;
				
		}
	}
	
	
	public static void organizarIntInsercion(int [] aray) {
		
		int aux=0, i= 0;
		
		for(int j = 0; j<aray.length;j++) {
			aux=aray[j];
			i=j-1;
			while(i>=0 && aray[i]>aux) {
				aray[i+1]=aray[i];
				i--;
			}
			
			aray [i+1]=aux;
		}
		
	}
	
	public static void organizarIntBurbuja	(int [] aray) {
		
		
	}
}
