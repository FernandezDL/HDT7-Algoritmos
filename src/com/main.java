/**
 * 
 */
package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Diana
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option=0;
		
		String menu="";
		String menu2="";
		String ruta="";
		
		Scanner in= new Scanner(System.in);
		
		boolean exit=false;
		
		while(!exit)
		{
			System.out.println("\n\nIngrese la ruta del archivo de texto o escribe \"Exit\" para cerrar la aplicacion");
			ruta= in.nextLine().toLowerCase();
			
			if(ruta.equals("exit"))
			{
				exit= true;
			}
			
			else
			{
				try {
                    File archivoPrograma = new File(ruta);
                    in = new Scanner(archivoPrograma);
                    while (in.hasNextLine()) {
                        String data = in.nextLine();
                        
                        System.out.println("\n\n-------------------------------------------------------------------------------------------------");
                        
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println("No se pudo leer el archivo");
                }
				
			}
		}
	}
}
