//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Cambio{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Cambio");
		System.out.println("Digite o valor em Dolares que deseja converter");
		double dolar=entrada.nextDouble();
		double mt =dolar*62;
		System.out.println("O valor de "+dolar+"USD$ em meticais equivale a "+mt+"MTN");

	}
}




