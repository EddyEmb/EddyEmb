//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class DiasVida{
	public static void main(String[] args){
	Scanner entrada=new Scanner(System.in);
	System.out.println("Bem Vindo ao Programa dias de Vida");
	System.out.println("Digite sua idade");
		int idade =entrada.nextInt();
		System.out.println("Digite o mes actual(em numero representativo)");
		int meses=entrada.nextInt();
		System.out.println("Digite o dia actual");
		int dias=entrada.nextInt();
		int diasvida= idade*365 + (meses-1)*30 +(30- dias);
		
		System.out.println(" Ja viveu " + diasvida+" dias na terra!");
		System.out.println(" Vida Longa!");
	
	
	}
}