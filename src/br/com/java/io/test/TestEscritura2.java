package br.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestEscritura2 {

	public static void main(String[] args) throws IOException {

	/*
		OutputStream fileOutputStream = new FileOutputStream("texto-generado.txt");
		
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		bufferedWriter.write("Primera linea de mi archivo generado");
		bufferedWriter.newLine();
		bufferedWriter.write("Segunda linea de mi archivo generado");

		bufferedWriter.close();
		
		
		*/
		
		FileWriter fileWriter = new FileWriter("Texto-file-writer.txt");
		
		fileWriter.write("Primera línea vía file Writer");
		fileWriter.write("\r\n");
		fileWriter.write("Segunda línea vía file Writer");
		fileWriter.close();

	}
}
