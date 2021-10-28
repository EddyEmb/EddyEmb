//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class temperaturaCpF{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Convert Celsios(C) para Fahrenheits(F)");
		System.out.println("Digite o valor das Celsios(C)");
		double celsios=entrada.nextDouble();
		double fahrenheits =celsios+32;
		System.out.println("O valor de "+celsios+"C em Fahrenheits equivale a "+fahrenheits+"F");

	}
}



