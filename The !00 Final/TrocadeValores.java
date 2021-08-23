//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TrocadeValores{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int c,d;
		System.out.println("Digite o valor de A: ");
		int a=entrada.nextInt();
		System.out.println("Digite o valor de B: ");
		int b=entrada.nextInt();
		c=a;
		d=b;
		b=c;
		a=d;
		System.out.println("O novo valor de A e' "+a);
		System.out.println("O novo valor de B e' "+b);
	}
} 