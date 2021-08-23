//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Raizquadrada{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Raiz Quadrada");
		System.out.println("Digite o valor que deseja saber a raiz");
		double valor=entrada.nextDouble();
		double raiz =Math.sqrt(valor);
		System.out.println("O quadrado de "+valor+" e' "+raiz);

	}
}




