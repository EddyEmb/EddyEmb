//Eddy@Emb 
import java.util.Scanner;
public class kmparam{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem vindo ao programa Convert Km para m");
		System.out.println("");
		System.out.println("Digite os Km");
		double km=entrada.nextDouble();
		double m =km/1000;
		System.out.println("O valor em metros e' "+m+"m");
		
	}

}