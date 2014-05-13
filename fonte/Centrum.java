import java.util.Scanner;
import java.io.File;

class Centrum {
	public static void main(String args[]) {
		File arquivo;
		Scanner scan;
		Interpretador lin;
		String comandos[] = new String[2000]; // arquivo pode ter, no máximo, 2000 linhas.
        
		try {
			arquivo = new File(args[0]);
			scan = new Scanner(arquivo);
			lin = new Interpretador();
            
			int i = 0;
			while(scan.hasNext()) {
				comandos[i] = scan.nextLine();
				i++;
			}
            
			lin.interpreta(comandos);
            
		} catch (Exception e) {
			System.out.println("Nao consegui ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
			System.out.println("Uso:");
			System.out.println("    java Blah /caminho/para/arquivo.blah");
		}
        
	}
}
