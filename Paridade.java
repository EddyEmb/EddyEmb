//Edimilson Baltazar Baloi Eddy@Emb 2k18
//Eddy@Emb 11/08
import java.util.Scanner;
public class Paridade{
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero=entrada.nextInt();
		 if (numero%2==0) {
		 	System.out.println(numero+" e' Par");
		 	
		 }
		 else {
		 	System.out.println(numero+" e' Impar");
		 }
	}
}