package informacoesDoCaminhoDoArquivo;

import java.io.File;
import java.util.Scanner;

public class ProgramParent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());//Nome do arquivo apenas e descarta o caminho completo.
		System.out.println("getParent: " + path.getParent());//Caminho sem o arquivo
		System.out.println("getParent: " + path.getPath()); //Caminho completo
		
		
	}

}
