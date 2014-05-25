import java.io.File;
import java.util.Scanner;	

public class Centrum{

	public static void main(String[] args) {
		
		File arquivo;
		Scanner conteudo;

		try{

			arquivo = new File(args[0]);
			conteudo = new Scanner(arquivo);

			Interpretador centrum = new Interpretador();
			centrum.interpreta = (conteudo);	
		
		}catch(Exception e){
			
				System.out.println("Nao e possivel ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
				System.out.println("Uso:\n Java Centrum /caminho/para/arquivo.cem");
				return;
				
		}
	}
}
