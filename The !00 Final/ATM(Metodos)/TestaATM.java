//Edimilson Baltazar Baloi Eddy@Emb 2k18

//Importacoes
import java.util.Scanner;
//Sintaxe do metodo main
public class TestaATM{
	public static void main(String[] args) {
		//Criacao de um objecto de entrada da Class Scanner

		Scanner entrada=new Scanner(System.in);

		//Declaraco de Variaveis
		int opcao;
		int sair;
		//Design inicial;
		/*Espacamento*/ System.out.println();
		System.out.println("|'''''''''''''''''''''''''''''''''''''''''''''''''|");
		System.out.println("|--    #Bem vindo a ATM do Grupo ByEmbCorp     !#-|");
		System.out.println("|_________________________________________________|");
			/*espacamento*/System.out.println();
			do{
			Menu.menu();
 						System.out.println("Digite 1 para ir ao Menu");
			System.out.println("Digite Zero(0) para terminar");
			sair=entrada.nextInt();
			if (sair==1) {
				Menu.menu();		
				}

 			}while(sair!=0);

	}
}
