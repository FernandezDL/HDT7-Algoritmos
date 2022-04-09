/**
 * 
 */
package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Diana
 *
 */
public class Archivo {

	public ArrayList<String> leerTxt(String ruta){
			
		File archivo= null;
		FileReader filereader= null;
		BufferedReader br= null;
		
		ArrayList<String> datos= new ArrayList<String>();
		String filas="";
		
		try 
		{
			archivo= new File(ruta);
			filereader= new FileReader(archivo);
			br= new BufferedReader(filereader);
			
			while((filas=br.readLine())!= null)
			{
				datos.add(filas);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("La ruta ingresada no es correcta o no se puede leer el archivo");
			System.out.println("Por favor intente nuevamente");
		}
		
		return datos;
	}
}
