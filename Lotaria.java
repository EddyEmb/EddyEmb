//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Lotaria{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Lotaria GoldenMirror");
		System.out.println("`````````````````````");
		int sorte=0;
		String numero;
		int numeroc=0;
		do{
		System.out.println("Digite um numero de 5 digitos");
		System.out.println("");
		 numero=entrada.nextLine();
		 int tamanho=numero.length();
		 if (tamanho!=5 ) {

		 	System.out.println("O numer parece incompleto tente novamente!");
		 }else{
		numeroc=Integer.parseInt(numero);
		 
		 sorte=(int)(Math.random()*50000)+10000;
		System.out.println(sorte);
		if (numeroc==sorte) {
		System.out.println("O seu numero da sorte e' "+sorte+" e voce Venceu!!");

			
		}else{
			System.out.println("|- Errou!!Talvez da proxima-|");

		}
	}
	}while(numeroc!=sorte);
	}
}