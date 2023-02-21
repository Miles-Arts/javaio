package br.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestEscrituraFileWriter {

	public static void main(String[] args) throws IOException {


		
		FileWriter fileWriter = new FileWriter("Texto-file-writer.txt");
		
		fileWriter.write("Primera línea via file Writer");
		//fileWriter.write("\r\n"); //salto de línea windows
		//fileWriter.write("n"); //salto línea Linux
		
		fileWriter.write(System.lineSeparator());//Para todos los sistemas Operativos 
		
		fileWriter.write("Segunda línea via file Writer");
		fileWriter.close();

	}
}
