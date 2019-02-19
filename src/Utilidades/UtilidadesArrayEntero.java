package Utilidades;

public class UtilidadesArrayEntero {
	
/**
 * devuelve la suma de los elementos de un vector de enteros
 * @param v vector de enteros a sumar
 * @return suma de los elementos del vector
 */
	public static double suma(int[] v) {
		double sum=0;
		for (int i=0;i<v.length;i++)
			sum+=v[i];
		return sum;		
	}
	
/**
 * Devuelve el mayor valor de los elementos de un vector de enteros
 * @param v vector de enteros en el que buscar
 * @return mayor entero encontrado
 */
	public static int mayor(int[] v) {
		int mayor=v[0];
		for(int i=1;i<v.length;i++)
			if(mayor<v[i])
				mayor=v[i];
		return mayor;
	}
	
/**
* Devuelve el menor valor de los elementos de un vector de enteros
 * @param v vector de enteros en el que buscar
 * @return menor entero encontrado
 */
	public static int menor(int[] v) {
		int menor=v[0];
		for(int i=1;i<v.length;i++)
			if(menor>v[i])
				menor=v[i];
		return menor;
	}
	
	
/**
 * Devuelve el número de veces que un determinado valor aparece en un vector de enteros
 * @param v vector de enteros en el que buscar
 * @param valor entero a buscar en el vector
 * @return numero de veces en el que valor aparece en el vector
 */
	public static int numero(int[] v, int valor) {
		int contador=0;
		for(int i=0;i<v.length;i++)
			if(v[i]==valor)
				contador++;
		return contador;
	}
	
/**
 * Ordena los elementos del vector de menor a mayor
 * @param v Vector a ordenar
 */
	public static void Burbuja(int[] v) {
		int aux;
		 for(int i=0;i<v.length-1;i++)
             for(int j=0;j<v.length-i-1;j++)
                  if(v[j+1]<v[j]){
                     aux=v[j+1];
                     v[j+1]=v[j];
                     v[j]=aux;
                  }
	}
	
	
/**
 * Devuelve la matriz transpuesta a una dada(Matriz en la que se cambian las filas por las columnas)
 * @param m Matriz de enteros a transponer 
 * @return matriz transpuesta
 */
	public static int[][] traspuesta(int[][] m){
		 int mT[][] = new int [m[0].length][m.length];
	     for(int i = 0; i < m.length; i++)
	        for (int j = 0; j < m[0].length; j++)
	            mT [j][i] = m[i][j];
	      return mT;         
	}
}