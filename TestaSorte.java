//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TestaSorte{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	System.out.println("Se acha com sorte?");
	int numerodasorte;
	int sorte;

		do{
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Insira o seu numero da sorte! [0-9]");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			numerodasorte=entrada.nextInt();	
			sorte=(int)(Math.random()*10);
			if (numerodasorte!=sorte) {

			System.out.println("|- Errou!!Tente novamente-|");
				
			}
		}while(numerodasorte!=sorte);
		System.out.println("!!-Hoje e' realmente  seu dia de Sorte! $Voce acertou-!!");
	}
}