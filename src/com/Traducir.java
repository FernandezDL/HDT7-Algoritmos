/**
 * 
 */
package com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Diana
 *
 */
public class Traducir {

	Archivo archivo= new Archivo();
	BinarySearchTree<String, String> arbolFrances= new BinarySearchTree<String, String>();
	BinarySearchTree<String, String> arbolIngles= new BinarySearchTree<String, String>();
	
	ArrayList<String> linea= new ArrayList<String>();
	
	public BinarySearchTree<String, String> getFrances(){
		return arbolFrances;
	}
	
	public BinarySearchTree<String, String> getIngles(){
		return arbolIngles;
	}
	
	public void arreglar(String ruta) throws IOException {
		ArrayList<String> data= new ArrayList<>();
		
		data= archivo.leerTxt(ruta);
		
		for (int i=0; i<data.size(); i++)
		{
			String[] palabras= data.get(i).split(",");
			for(int j=0; j<palabras.length; j++)
			{
				palabras[j]= palabras[j].toLowerCase();
				linea.add(palabras[j]);
			}
		}
	}
	
	public void hacerArbol() {
		ArrayList<String> ingles= new ArrayList<String>();
		ArrayList<String> frances= new ArrayList<String>();
		ArrayList<String> espanol= new ArrayList<String>();
		
		for(int i=0; i<linea.size(); i++)
		{
			String[] palabra= linea.get(i).split(",");
			
			for(int j=0; j<palabra.length; j++)
			{
				palabra[j]= palabra[j].toLowerCase();
				
				ingles.add(palabra[j]);
				espanol.add(palabra[j+1]);
				frances.add(palabra[j+2]);
			}
			
			for (int l=0; l< ingles.size(); l++)
			{
				arbolIngles.insert(ingles.get(l), espanol.get(l));
			}
			
			for(int q=0; q< frances.size(); q++)
			{
				arbolFrances.insert(frances.get(q), espanol.get(q));
			}
		}
	}
}
