//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Volume{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("#-Calcule o Volume do rectangulo");
				System.out.println("Digite o comprimento:");
				int comprimento=entrada.nextInt();
				System.out.println("Digite a largura:");
				int largura=entrada.nextInt();
				System.out.println("Digite a altura:");
				int altura=entrada.nextInt();
				int volume=comprimento*largura*altura;

				System.out.println("O volume do rectangulo e'"+volume);
			
	}
}