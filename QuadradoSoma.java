//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class QuadradoSoma{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
			System.out.println("Digite o primeiro numero");
			int numero1=entrada.nextInt();
			System.out.println("Digite o segundo numero");
			int numero2=entrada.nextInt();
			numero1=(int)Math.pow(numero1,2);
			numero2=(int)Math.pow(numero2,2);
			int resultado= numero1+numero2;
			System.out.println("A soma do quadrado e' "+resultado);
	}
}