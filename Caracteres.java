//Eddy@Emb 29-08
//	PROGRAMA QUE IMPRIME CADA CARACTER
import java.util.Scanner;
public class Caracteres{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		//Variaveis
		String palavra;
		int contador=0;
		char letra;

		//Insira dados
		System.out.println("Insira uma palavra");
		palavra=entrada.nextLine();

		//Tamanho
		int tamanho=palavra.length();
		
		//Condicao
		while(tamanho>contador){
			//
			letra=palavra.charAt(contador);
			System.out.println(letra);

		//Incrementacao do contador
		contador++;
		

	
		}
		

	}

}