//Eddy@Emb 29-08
//	PROGRAMA QUE IMPRIME O INVERSO DE CADA CARACTER
import java.util.Scanner;
public class CaracteresInverso{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		//Variaveis
		String palavra;
		int contador=0;
		char letra;

		//Insira dados
		System.out.printf("Insira uma palavra: ");
		palavra=entrada.nextLine();

		//Tamanho
		int tamanho=palavra.length();
		
		//Condicao
		while(tamanho>contador){
			//Decrementacao do tamanho
			tamanho--;
			letra=palavra.charAt(tamanho);
			System.out.println(letra);

		
		
		

	
		}
		

	}

}