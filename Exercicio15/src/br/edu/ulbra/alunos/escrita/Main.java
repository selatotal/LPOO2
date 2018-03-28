package br.edu.ulbra.alunos.escrita;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ulbra.alunos.model.Aluno;

public class Main {

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		
		for (int i=1; i <= 5; i++) {
			System.out.println("Dados do aluno " + i);
			System.out.print("Informe o nome: ");
			String nome = teclado.nextLine();
			System.out.print("Informe a nota de G1: ");
			double notaG1 = teclado.nextDouble();
			System.out.print("Informe a nota de G2: ");
			double notaG2 = teclado.nextDouble();
			teclado.nextLine();
			
			alunos.add(new Aluno(nome, notaG1, notaG2));
		}
		
		try {
			ObjectOutputStream arquivoSaida = new ObjectOutputStream(new FileOutputStream("alunos.dat"));
			arquivoSaida.writeObject(alunos);
			arquivoSaida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		teclado.close();
	}

}
