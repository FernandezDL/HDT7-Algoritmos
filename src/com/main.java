/**
 * 
 */
package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
		
		ArrayList<String> data= new ArrayList<String>();
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
				try 
				{
                    File archivoPrograma = new File(ruta);
                    leerArchivo leer= new leerArchivo();
                    in = new Scanner(archivoPrograma);
                    
                    data= leer.leerTxt(ruta);
                    
                    if(data!= null)
                    {
                    	//for 
                    }
                    
                } catch (FileNotFoundException ex) {
                    System.out.println("No se pudo leer el archivo");
                }
				
			}
		}
	}
}
