//Edimilson Baltazar Baloi Eddy@Emb 2k18
//Eddy@Emb 29-08
import java.util.Scanner;
public class MaiorMenor{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite um A");
		int a =entrada.nextInt();
		System.out.println("Digite um B");
		int b=entrada.nextInt();
		System.out.println("Digite um C");
		int c=entrada.nextInt();
		int soma=a+b;
		if (soma>=c) {
			System.out.println("O valor da soma e' igual ou maior que o  valor de C="+c);
			
		}else {
			System.out.println("O valor da soma e' menor que ao valor de C="+c);
			
		}
		

	}

}