package br.com.alfa.exemploAlfa2017;

public class Retangulo {
	
	private Double ladoX;
	private Double ladoY;
	
	public Retangulo(Double ladoX, Double ladoY) {
		this.ladoX = ladoX;
		this.ladoY = ladoY;
	}
	
	public Double getArea() {
		return ladoX*ladoY;
	}
	
	public Double getPerimetro() {
		return 2*ladoX+2*ladoY;
	}

}
