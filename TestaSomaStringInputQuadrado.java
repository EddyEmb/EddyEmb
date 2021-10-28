//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TestaSomaStringInputQuadrado{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao programa Soma quadrados em String");
		//String Dados
		String sair;
		do{
		System.out.println("Digite a Soma");
		String operacao=entrada.nextLine();
		if (operacao.contains("=")) {
			
		
		if (operacao.contains("+")) {
				
			
			int numero1=Integer.parseInt(operacao.substring(0,operacao.indexOf("+")));
			int numero2=Integer.parseInt(operacao.substring(operacao.indexOf("+")+1,operacao.indexOf("=")));
			double soma = Math.pow(numero1,2) + Math.pow(numero2,2);
		System.out.println("O resultado da soma dos quadrados e'  "+soma);
		}
	}else{
	System.out.println("Digite no formato \"numero1+numeo2r=\"");
}				System.out.print("Digite sair para terminar: ");
				sair=entrada.nextLine();
		}while(sair.equalsIgnoreCase("sair"));
}
}