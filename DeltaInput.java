//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class DeltaInput{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite a equacao:");
	String operacao=entrada.nextLine();
	String sair;
		do{
			if (operacao.contains("x^2")) {
				if (operacao.contains("x")) {
					
				if (operacao.contains("=")) {
						//ax^2
			int a=Integer.parseInt(operacao.substring(0,operacao.indexOf("x^2")));
			//bx
			int b=Integer.parseInt(operacao.substring(operacao.indexOf("x^2")+3,operacao.lastIndexOf("x")));
			//c
			int c=Integer.parseInt(operacao.substring(operacao.lastIndexOf("x")+1,operacao.indexOf("=")));
			
					
				
			
		if (a!=0) {
				int delta=(int)Math.pow(b,2)-4*a*c;
			
			if (a>0) {
				System.out.println("O grafico tem concavidade virada para Cima .\n O valor do delta e' delta="+delta);
				
			}else if (a<0) {
				System.out.println("O grafico tem concavidade virada para baixo .\n O valor do delta e' delta="+delta);
				
			}
			if (delta>0) {
				System.out.println("A equacao tem dois zeros diferentes X1!=X2");
				
			}else if (delta<0) {
				System.out.println("A equacao nao tem zeros reais");
				
			}else  {
				System.out.println("A equacao tem dois zeros iguais X1==X2");
				
			}
			
		}
		 }
		 }
		}else {
	System.out.println("Digite no formato \"ax^2+bx+c=\"");
			
		}
			System.out.print("Digite sair para terminar: ");
				sair=entrada.nextLine();
	  }while (sair=="sair");	
	}
}