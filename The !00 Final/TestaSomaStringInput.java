//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
//Imprime o resultado da divisao de valores de uma String
public class TestaSomaStringInput{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		//String Dados
		String sair;
		do{
		System.out.println("Digite a Soma");
		String operacao=entrada.nextLine();
		if (operacao.contains("=")) {
			
		
		if (operacao.contains("+")) {
				
			
			int numero1=Integer.parseInt(operacao.substring(0,operacao.indexOf("+")));
			int numero2=Integer.parseInt(operacao.substring(operacao.indexOf("+")+1,operacao.indexOf("=")));
			int resultado=numero1+numero2;
		System.out.println("O resultado de "+operacao+resultado);
		}
	}else{
	System.out.println("Digite no formato \"numero1+numeo2r=\"");
}				System.out.print("Digite sair para terminar: ");
				sair=entrada.nextLine();
		}while(sair.equalsIgnoreCase("sair"));
}
}