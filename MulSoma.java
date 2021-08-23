//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class MulSoma{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite um numero A");
		int a=entrada.nextInt();
		System.out.println("Digite um numero B");
		int b=entrada.nextInt();
		System.out.println("Digite um numero C");
		int c=entrada.nextInt();
		System.out.println("Digite um numero D");
		int d=entrada.nextInt();
		int ab=a*c+a*d;
		int db=a*(c+d);
		System.out.println("1.Propriedade distributiva ab=a*c+a*d="+ab);
		System.out.println("2.Propriedade distributiva db=a*(c+d)="+db);

	}
}