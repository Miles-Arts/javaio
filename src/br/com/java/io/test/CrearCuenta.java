package br.com.java.io.test;

public class CrearCuenta {
	
	public static void main(String[] args) {
		
		
		Cuenta primeraCuenta = new Cuenta(0);
		primeraCuenta.saldo = 1000;
		
		System.out.println(primeraCuenta.saldo);
	}

}
