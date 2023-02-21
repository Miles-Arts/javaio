package br.com.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestLectura2 {
	
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner scanner = new Scanner(new File("archivo.csv"));
		
		//String linea = scanner.nextLine();
		
		//System.err.println(linea);
		
		String linea; 
		
		/*while ((linea = scanner.nextLine()) != null  && scanner.hasNextLong()) {
			System.out.println(linea);
		}*/
		
		while ((linea = scanner.nextLine()) != null ) {
			System.out.println(linea);
		}
		
	}

}
