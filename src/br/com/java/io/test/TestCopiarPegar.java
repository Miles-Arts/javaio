package br.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestCopiarPegar {

	public static void main(String[] args) throws IOException {
		

		//FileInputStream fileInputStream = new FileInputStream("text.txt");
		InputStream fileInputStream =  System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		
		
		// genero el archivo
		OutputStream fileOutputStream = new FileOutputStream("text-copia.txt");
		// Proceso el archivo
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		// Escribir el archivo
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		
		String linea;

		while ((linea = bufferedReader.readLine()) != null) {
			bufferedWriter.write(linea);
			bufferedWriter.newLine();
		}
		
		bufferedWriter.close();
		
	}
}
