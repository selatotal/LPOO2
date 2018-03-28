package br.edu.ulbra.alunos.model;

import java.io.Serializable;

public class Aluno implements Serializable {

	private static final long serialVersionUID = -8026643030090353460L;
	private String nome;
	private double notaG1;
	private double notaG2;

	public Aluno() {
		
	}
	
	public Aluno(String nome, double notaG1, double notaG2) {
		this.nome = nome;
		this.notaG1 = notaG1;
		this.notaG2 = notaG2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaG1() {
		return notaG1;
	}

	public void setNotaG1(double notaG1) {
		this.notaG1 = notaG1;
	}

	public double getNotaG2() {
		return notaG2;
	}

	public void setNotaG2(double notaG2) {
		this.notaG2 = notaG2;
	}
	
	public double getMedia() {
		return (this.notaG1 + 2 * this.notaG2) / 3.0;
	}
	
	public boolean isAprovado() {
		if (this.getMedia() >= 6d) {
			return true;
		}
		return false;
	}

}
