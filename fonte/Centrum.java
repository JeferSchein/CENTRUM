import java.util.Scanner;
import java.io.File;

public class Centrum{

	public static void main(String[] args) {
		try{
			// Lê o arquivo.
			File arquivo = new File(args[0]);
			Scanner conteudo = new Scanner(arquivo);

		}catch (Exception e) {

			// Mostra o uso e sair caso o arquivo seja inválido.
			System.out.println("Nao e possivel ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
			System.out.println("Uso:\n    Java Centrum /caminho/para/arquivo.cem");
			return;
		}

		Interpretador centrum = new Interpretador();
		centrum.interpreta(conteudo);

	}

}
