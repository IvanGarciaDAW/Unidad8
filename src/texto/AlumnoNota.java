package texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlumnoNota {
	public static void main(String[] args) {
		//Leer el fichero notas.txt, y pàra cada alumno calcular su nota.
		
		try {
			Scanner entrada = new Scanner(new File("notas.txt"));
				String linea;
				String split[];
			while(entrada.hasNext()) {
				linea=entrada.nextLine();
//				System.out.println(linea);
				split=linea.split(" ");
//				System.out.println(split[0]);
				String nombre=split[0];
				double suma=0.0;
				for(int i=1; i<split.length; i++) {
					suma+=Integer.parseInt(split[i]);
				}
				System.out.println(nombre+" Nota media "+(suma/3));
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
