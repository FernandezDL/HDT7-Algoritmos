/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Diana
 *
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option=0;
		
		String menu="";
		String menu2="";
		String ruta="";
		String traduccion1="";
		String traduccion2="";
		String resultado="";
		
		ArrayList<String> data= new ArrayList<String>();
		ArrayList<String> traduccion= new ArrayList<String>();
		
		Traducir traducir= new Traducir();
		
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
                    Archivo archivo= new Archivo();

                    traducir.arreglar(ruta);
                    traducir.hacerArbol();
                    
                    data= archivo.leerTxt(ruta);
                    
                    for(int i=0; i<data.size(); i++)
                    {
                    	String[] palabras= data.get(i).split(" ");
                    	
                    	for (int j=0; i<palabras.length; j++)
                    	{
                    		palabras[j]= palabras[j].toLowerCase();
                    		traduccion.add(palabras[j]);
                    	}
                    }
                    
                    for (int i=0; i<traduccion.size(); i++)
                    {
                    	traduccion1= traducir.getFrances().find2(traduccion.get(i));
                    	traduccion2= traducir.getIngles().find2(traduccion.get(i));
                    	
                    	if (!(traduccion1.isEmpty()))
            			{
                    		option=1;
                    		break;
            			}
                    	
                    	else if(!(traduccion2.isEmpty()))
                    	{
                    		option=-1;
                    		break;
                    	}
                    	
                    	else
                    	{
                    		option=0;
                    	}
                    }
                    
                    if(option==1)
                    {
                    	for (int u=0; u< traduccion.size();u++)
                    	resultado= resultado + " " + traducir.getFrances().find2(traduccion.get(u));
                    }
                    
                    else if(option==-1)
                    {
                    	for (int u=0; u< traduccion.size();u++)
                    	resultado= resultado + " " + traducir.getIngles().find2(traduccion.get(u));
                    }
                    
                    else
                    {
                    	System.out.println("No se econtraron las palabras, por favor intente nuevamente");
                    }
                    
                    System.out.println(resultado);
                    
                } 
				catch (Exception e) 
				{
                    System.out.println("No se pudo leer el archivo");
                }	
			}
		}
	}
}
