package br.com.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TestLectura2 {
	
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner scanner = new Scanner(new File("archivo.csv"));
		
		//String linea = scanner.nextLine();
		
		//System.err.println(linea);
		
		String linea; 
		
		while (scanner.hasNextLine() && ( linea = scanner.nextLine()) != null ) {
			//System.out.println(linea);
			
			//USANDO SPLIT
			/*String[] lineas = linea.split(",");
			//System.out.println(lineas);
			System.out.println(Arrays.toString(lineas));
		
			System.out.println(lineas[3]);*/
			
			//USANDO SCANNER
			Scanner lineaScanner = new Scanner(linea);
		
			lineaScanner.useDelimiter(",");
			
			String valor;
			
			while (lineaScanner.hasNextLine() && ( valor = lineaScanner.nextLine())  != null ) {
				
				System.err.println(valor);
			}
			
		}
		
		/*while ((linea = scanner.nextLine()) != null ) {
			System.out.println(linea);
		}*/
		
	}

}
