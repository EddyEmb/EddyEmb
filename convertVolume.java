//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class convertVolume{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem vindo ao Programa Convert Decimetro-Litro");
		System.out.println("");
		System.out.println("Digite o volume em decimetro");
		double decimetro=entrada.nextDouble();
		double resultado=decimetro/10;
		System.out.println("O valor de "+decimetro+"dl em litros sao "+resultado+"l");
	}
}