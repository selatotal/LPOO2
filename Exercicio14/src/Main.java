import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome do arquivo: ");
		String fileName = teclado.nextLine();
		
		try {
			Scanner input = new Scanner(new File(fileName));
			int[] totVogais = new int[5];
			while(input.hasNextLine()) {
				String linha = input.nextLine().toUpperCase();
				for(char c : linha.toCharArray()) {
					switch (c) {
					case 'A': totVogais[0]++;
						break;
					case 'E': totVogais[1]++;
						break;
					case 'I': totVogais[2]++;
						break;
					case 'O': totVogais[3]++;
						break;
					case 'U': totVogais[4]++;
						break;
					}
				}
			}
			System.out.println("Total de A: " + totVogais[0]);
			System.out.println("Total de E: " + totVogais[1]);
			System.out.println("Total de I: " + totVogais[2]);
			System.out.println("Total de O: " + totVogais[3]);
			System.out.println("Total de U: " + totVogais[4]);
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		}
		teclado.close();
	}
	
}
