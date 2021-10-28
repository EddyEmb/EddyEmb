//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class velocidade{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Convert km/h para m/s");
		System.out.println("Digite o valor dos km/h");
		double kmh=entrada.nextDouble();
		double ms =kmh*10/36;
		System.out.println("O valor de "+kmh+"km/h em m/s equivale a "+ms+"m/s");

	}
}




