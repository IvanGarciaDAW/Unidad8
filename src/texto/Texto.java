package texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Texto {
	public static void main(String[] args) {
		//try catch es para que se puedan crean documentos correctos, y no den errores.
//		se pueden manejar expeciones de error con esto.
		
		//Escribir 
		Scanner kb = new Scanner(System.in);
		File f= new File("numeros.txt");
		try {
			PrintWriter salida=new PrintWriter(f);
		int numero = 0;
			do {
				System.out.println("Dame un numero");
				numero = kb.nextInt();
//				Imprime en el fichero
				salida.println(numero);
			}while(numero!=0);
			//Para guardar los dato insertados en el fichero.
			salida.flush();
			salida.close();
			
		} catch (Exception e) {
			//Salida de error
			System.err.println("Ha habido un error en el programa");
		}
		//Leer el fichero
		System.out.println("Leemos el fichero");
		try {
			Scanner entrada=new Scanner(f);
			int intNumero=0;
			while(entrada.hasNext()) {
				intNumero=entrada.nextInt();
				System.out.println(intNumero);
			}
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
