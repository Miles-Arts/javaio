package br.com.java.io.test;

public class Cuenta {

	double saldo;
	private int agenica;
	private int numero;
	private String titular;
	//private public char[] getCuenta;
	
	
	public Cuenta(double saldo) {
		
		this.saldo = saldo;
	
	}


	public double getSaldo() {
		
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getAgenica() {
		return agenica;
	}


	public void setAgenica(int agenica) {
		this.agenica = agenica;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
}
