//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TestaVogais{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		String vogais="aeiou";
		System.out.println("Digite uma palavra Qualquer");
		String palavra=entrada.nextLine();
		int tamanho=vogais.length()-1;
		int vogal=0;
		for (int i=0;tamanho>=i;i++) {
			for (int j=0;j<=tamanho;j++ ) {
				if (palavra.charAt(i)==vogais.charAt(j)) {
				vogal=vogal+1;
					
				}
			}
			
		}
		System.out.println("Na palavra [" +palavra+ "] existem "+vogal+"-vogal/is");

	}
}