package br.edu.ulbra.alunos.leitura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import br.edu.ulbra.alunos.model.Aluno;

public class Main {

	public static void main(String[] args) {

		try {
			ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream("alunos.dat"));
			
			ArrayList<Aluno> alunos = (ArrayList<Aluno>) inputFile.readObject();
			
			for (Aluno aluno : alunos) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("G1: " + aluno.getNotaG1());
				System.out.println("G2: " + aluno.getNotaG2());
				System.out.println("Media: " + aluno.getMedia());
				if (aluno.isAprovado()) {
					System.out.println("Resultado: APROVADO");
				} else {
					System.out.println("Resultado: REPROVADO");
				}
			}
			
			inputFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}