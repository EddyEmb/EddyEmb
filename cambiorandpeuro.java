//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class cambiorandpeuro{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Cambio Rand para Euro");
		System.out.println("Digite o valor dos Rands");
		double zar=entrada.nextDouble();
		double euro =zar*0.0677;
		System.out.println("O valor de "+zar+"Rands em Euros equivale a "+euro+"E");

	}
}




