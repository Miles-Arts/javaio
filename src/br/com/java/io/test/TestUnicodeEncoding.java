package br.com.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestUnicodeEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		
		String letra = "A"; //Encopoint 65
		
		System.out.println("Codepoint: " + letra.codePointAt(0));
		
		//Charset charser =  Charset.defaultCharset();
		Charset charset =  Charset.forName("windows-1252");
		System.out.println("Charset: " + charset.displayName());
		
		//byte[] bytes = letra.getBytes();
		//byte[] bytes = letra.getBytes("UTF-16");
		byte[] bytes = letra.getBytes(StandardCharsets.ISO_8859_1);
		
		System.out.println("Cantidad de bytes: " + bytes.length);
		
		//System.out.println(charset.availableCharsets());
		
	}

}
