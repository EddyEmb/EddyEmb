//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class ArrayPar{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int notas[]=new int[50];
		System.out.println("Bem vIndo ao Armazera par no array");
		System.out.println("Digite Um numero");
		int numero=entrada.nextInt();

			if (numero%2==0) {
					notas[0]=numero;
		System.out.println("O Elemento na posicão "+0+"  e' :"+notas[0]);
		
			
		}
	}
}