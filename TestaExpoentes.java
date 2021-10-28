//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TestaExpoentes{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor=entrada.nextInt();
		double quadrado=Math.pow(valor,2);
		double cubo=Math.pow(valor,3);
		System.out.println("O quadrado de "+valor+" e'"+quadrado);
		System.out.println("O cubo de "+valor+" e'"+cubo);
			
	}
}