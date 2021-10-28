//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class cambiomz{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Cambio MTN para ZAR");
		System.out.println("Digite o valor dos MTN");
		double mtn=entrada.nextDouble();
		double zar =mtn/4.5;
		System.out.println("O valor de "+mtn+"MTN em Rand equivale a "+zar+"Rand");

	}
}




