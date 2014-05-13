import java.util.Scanner;
import java.io.File;

public class Centrum{

	public static void main(String[] args) {
		
		// Se não há arquivo de entrada mostra a ajuda.
		if (args.length !=1) {
			System.out.println("Uso:");
			System.out.println("java Centrum /caminho/para/arquivo.cem");
			return;
		}

		// Lê o arquivo.
		File arquivo = new File(args[0]);
		Scanner conteudo = new Scanner(arquivo);

		//Executa o interpretador.
		Interpretador centrum  = new Interpretador();
		centrum.interpreta(conteudo);
	}

}
