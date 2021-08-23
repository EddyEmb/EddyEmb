//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class ConvertMintoSe{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Convert Min para Seg");
		System.out.println("Digite o valor em minutos");
		double minutos=entrada.nextDouble();
		double segundos =minutos*60;
		System.out.println("O valor de "+minutos+"min em segundos equivale a "+segundos+"s");

	}
}




