package br.com.java.io.test;

import java.nio.charset.Charset;

public class TestUnicodeEncoding {
	
	public static void main(String[] args) {
		
		
		
		String letra = "A"; //Encopoint 65
		
		System.out.println("Codepoint: " + letra.codePointAt(0));
		
		Charset charset =  Charset.defaultCharset();
		System.out.println("Charset: " + Charset.defaultCharset());
	}

}
