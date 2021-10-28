//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class CambioInverso{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Cambio");
		System.out.println("Digite o valor em meticais que deseja converter");
		double mt=entrada.nextDouble();
		double dolar =mt/62;
		System.out.println("O valor de "+mt+"MTN em dolares equivale a "+dolar+"USD$");

	}
}




