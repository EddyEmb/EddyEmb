//Edimilson Baltazar Baloi Eddy@Emb 2k18
	import java.util.Scanner;
public class TestaReplace{
	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);

		System.out.println("Insira uma Frase");
		String palavra=entrada.nextLine();
		int tamanho=palavra.length()-1;
		System.out.println(palavra);

		System.out.println("Insira a palavra que deseja mudar");
		String letra1=entrada.nextLine();
		System.out.println("Insira a nova palavra");
		String letra2=entrada.nextLine();

		System.out.println(""+palavra.replace(letra1+"",letra2 ));
	}
}



