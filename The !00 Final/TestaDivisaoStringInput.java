//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
//Imprime o resultado da divisao de valores de uma String
public class TestaDivisaoStringInput{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		//String Dados
		String sair;
		do{
		System.out.println("Digite a divisao");
		String operacao=entrada.nextLine();
		if (operacao.contains("=")) {
			
		
		if (operacao.contains("/")) {
				
			
		//String operacao="14/98=";
			//Dividendo 14
			double dividendo=Double.parseDouble(operacao.substring(0,operacao.indexOf("/")));
			//divisor 98
			double divisor=Double.parseDouble(operacao.substring(operacao.indexOf("/")+1,operacao.indexOf("=")));
			//Resultado 10/98
			double resultado=dividendo/divisor;
		System.out.println("O resultado de "+operacao+resultado);
		}
	}else{
	System.out.println("Digite no formato \"dividendo/divisor=\"");
}				System.out.print("Digite sair para terminar: ");
				sair=entrada.nextLine();
		}while(sair.equalsIgnoreCase("sair"));
}
}