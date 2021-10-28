//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Delta{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		System.out.println("Bem Vindo ao #Programa Calcula Delta#");
		System.out.println("Digite o valor de a:");
		System.out.print("a:");
		int a=entrada.nextInt();
		System.out.println("Digite o valor de b:");
		System.out.print("b:");
		int b=entrada.nextInt();
		System.out.println("Digite o valor de c:");
		System.out.print("c:");
		int c=entrada.nextInt();
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