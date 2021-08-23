//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class ProgdezAntes{
	public static void main (String[] args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem vindo ao programa 10 numeros antes ");
	System.out.println("Digite um numero");
		int numero =entrada.nextInt();
	for (int i=0;i<10 ;i++ ) {
		numero=numero-1;
			System.out.println(numero);
		}
		
	}
	
}
