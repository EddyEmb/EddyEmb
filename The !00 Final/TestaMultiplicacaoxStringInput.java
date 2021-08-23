//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
//Imprime o resultado da divisao de valores de uma String
public class TestaMultiplicacaoxStringInput{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		//String Dados
		String sair;
		String sinal="x";
		do{
		System.out.println("Digite a multiplicacao");
		String operacao=entrada.nextLine();
		if (operacao.contains("=")) {
			
		
		if (operacao.contains(sinal)) {
				
			
			int numero1=Integer.parseInt(operacao.substring(0,operacao.indexOf(sinal)));
			int numero2=Integer.parseInt(operacao.substring(operacao.indexOf(sinal)+1,operacao.indexOf("=")));
			int resultado=numero1*numero2;
		System.out.println("O resultado de "+operacao+resultado);
		}
	}else{
	System.out.println("Digite no formato \"numero1xnumeo2r=\"");
}				System.out.print("Digite sair para terminar: ");
				sair=entrada.nextLine();
		}while(sair.equalsIgnoreCase("sair"));
}
}