package exercicioCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramCSV {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ProductCSV> list = new ArrayList<>(); // Lista criada para armazenar os dados da classe Product.
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);//Classe File permite que possamos passar o caminho do arquivo
		String sourceFolderStr = sourceFile.getParent()	; //criacao da variavel string que pegará o caminho, despresando o nome do arquivo.
		
		boolean sucess = new File(sourceFolderStr + "\\out").mkdir(); //caso não exista a pasta out, crie.
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; // criacao da variavel string que resultará no arquivo de saída.
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {//leitura de caracter atráves de um buffer de memória
			
			String itemCsv = br.readLine();
			while (itemCsv != null) {
			
				String[] fields = itemCsv.split(","); // separando a string usando a virgula como referência
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new ProductCSV(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				
				for (ProductCSV item: list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr  + " CREATED");
				
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		} catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		System.out.println("Folder created: " + sucess);
		
		sc.close();
	}

}
