package br.com.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestLectura {
	
	
	public static void main(String[] args) throws IOException {

		//Obtengo el archivo
		//FileInputStream fileInputStream = new  FileInputStream("texto.txt");
		InputStream fileInputStream = new  FileInputStream("texto.txt");
		
		//Proceso el archivo
		//InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		Reader inputStreamReader = new InputStreamReader(fileInputStream);
		
		//Leer el archivo
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		
		//String linea = bufferedReader.readLine();
		String linea;
		//System.out.println(linea);
		
		while ((linea = bufferedReader.readLine()) != null) {
			System.out.println(linea);
		}
		
	}
}




















