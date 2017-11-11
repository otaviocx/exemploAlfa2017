package br.com.alfa.exemploAlfa2017;

public class Quadrado {
	private Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}
	
	public Double getArea() {
		return 2*lado;
	}
	
	public Double getPerimetro() {
		return 4*lado;
	}
}
