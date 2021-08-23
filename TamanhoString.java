//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TamanhoString {
	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);	
		System.out.println("Digite uma frase");
		String palavra =entrada.nextLine() ;
		int tamanho=palavra.length();
		System.out.println("Essa tem "+tamanho+" caracteres (incluindo espacos)");

	}
}
