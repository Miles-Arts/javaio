package br.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TestCopiarPegar {

	public static void main(String[] args) throws IOException {

		
		Socket socket = new Socket();
		
		//InputStream inputStream = System.in;
		//InputStream fileInputStream = new FileInputStream("texto.txt");
		
		
		
		Reader inputStreamReader = new InputStreamReader(socket.getInputStream());
		
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		
		Socket socket2 = new Socket();
		
		//OutputStream fileOutputStream = new FileOutputStream("texto-copia.txt");
		
		//Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		Writer outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
		
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		

		String linea;

		while ((linea = bufferedReader.readLine()) != null) {
			bufferedWriter.write(linea);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();
	}
}