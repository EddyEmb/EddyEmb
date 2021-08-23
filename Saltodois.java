//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Saltodois{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Cinco Saltos");
		System.out.println("Digite Um numero");
		int numero=entrada.nextInt();
		for (int i=0;i<numero ;i=i+2) {
			System.out.println("As combinacoes dois a dois apartir de "+numero+" sao "+i);
	
			}
	}
}