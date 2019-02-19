package ejercicio05;

public class Menu {

	private Alumno notas[];

	public Menu() {

		notas = new Alumno[5];

	}

	public void agregarAlumno(Alumno alumno) {

		boolean encontrado = false;

		for (int i = 0; i < notas.length && !encontrado; i++)
			if (notas[i] == null) {
				notas[i] = alumno;
				encontrado = true;
			}

		if (encontrado)
			System.out.println("Se ha añadido el alumno");
		else
			System.out.println("No hay mas sitio");
	}

	public void mediaAlumnos() {

		double suma;

		int contApro = 0, contSus = 0;

		for (int i = 0;  notas[i]!=null && i < notas.length ; i++) {

			suma = 0;

			if (notas [i] !=null) {
			suma = notas[i].getNota1() + notas[i].getNota2() + notas[i].getNota3();

			System.out.println("Alumno con ID: " + notas[i].getId());
			System.out.println("Nombre: " + notas[i].getNombre());
			System.out.println("Su media es " + suma / 3);

			if (suma / 3 > 5) {
				contApro++;
			} else {
				contSus++;
			}

			System.out.println();

		}

		System.out.println();
		}

		System.out.println("Hay " + contApro + " aprobados y " + contSus + " suspensos");
	}

	public double media() {
		double sum1 = 0, sumT = 0, media = 0;

		int contAlum = 0;

		for (int i = 0; i < notas.length && notas[i] != null; i++) {
			sum1 += (notas[i].getNota1()+notas[i].getNota2()+notas[i].getNota3()/3);
			sumT+=sum1; //sumo las medias de cada alumno
			contAlum++;//cuento los alumnos que hay
		}

		
		media = sumT / contAlum; //hago la media 
		return media; //pero no sale, supongo que mal planteamiento
	}
	
	
	
	public void mediaEvaluacion ()	{
		
		double sum1=0, media1=0,sum2=0,sum3=0,media2=0,media3=0;
		int cont1=0,cont2=0,cont3=0;
		
		for (int i = 0; i < notas.length && notas[i] != null; i++) {
			sum1+=notas[i].getNota1();
			cont1++;
		}
		media1=sum1/cont1;
		
		System.out.println("La media de la primera evalucaion es "+media1);
		
		for (int i = 0; i < notas.length && notas[i] != null; i++) {
			sum2+=notas[i].getNota2();
			cont2++;
		}
		media2=sum2/cont2;
		
		System.out.println("La media de la primera evalucaion es "+media2);
		
		for (int i = 0; i < notas.length && notas[i] != null; i++) {
			sum3+=notas[i].getNota3();
			cont3++;
		}
		media3=sum3/cont3;
		
		System.out.println("La media de la primera evalucaion es "+media3);
		
		//perdon, he declarado demasiadas variables, se podrai haber hecho con metodos pero se me iba el tiempo
		//
		
	}

}
