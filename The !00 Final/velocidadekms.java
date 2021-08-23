//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class velocidadekms{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Convert km/s para m/s");
		System.out.println("Digite o valor dos km/s");
		double kms=entrada.nextDouble();
		double ms =kms*1000;
		System.out.println("O valor de "+kms+"km/s em m/s equivale a "+ms+"m/s");

	}
}




