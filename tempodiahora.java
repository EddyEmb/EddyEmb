//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class tempodiahora{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Convert dia para Horas");
		System.out.println("Digite o valor dos dias");
		double dia=entrada.nextDouble();
		double hora =dia*24;
		System.out.println("O valor de "+dia+"dias em horas equivale a "+hora+"horas");

	}
}




