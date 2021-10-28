//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Mes{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("................................................");

		System.out.println("[|=========================================|]");
		System.out.println("||- Bem  Vindo ao Numero de dias do Mes   -|]");
		System.out.println("[|=========================================|]");
		System.out.println("................................................");
		//Variaveis
		int ano;
		int numero;

		//Entrada
		System.out.println("[- Insira o Ano- ]");
		            ano=entrada.nextInt();

		System.out.println("[- Insira o numero referente ao mes do ano -]");
		numero=entrada.nextInt();

		switch(numero){
			case 1:
			System.out.println("[Ano]:"+ano);
			System.out.println("O mes de janeiro tem "+31+" dias");
			break;
			case 2:		
			if (ano%4==0){
			System.out.println("Ano: "+ano);		
			System.out.println("O mes de Fevereiro tem "+29+"dias");
			
			}else if(ano%4!=0){
			System.out.println("Ano: "+ano);
			 System.out.println("O mes de Fevereiro tem "+28+"dias");
			}	
			break;
			case 3:
			System.out.println("Ano:"+ano);
			System.out.println("O mes de Marco tem "+31+" dias");
			break;
			case 4:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Abril tem "+30+" dias");
			break;
			case 5:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Maio tem "+31+" dias");
			break;
			case 6:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Junho tem "+30+" dias");
			break;
			case 7:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Julho tem "+31+" dias");
			break;
			case 8:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Agosto tem "+31+" dias");
			break;
			case 9:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Setembro tem "+30+" dias");
			break;
			case 10:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Outubro tem "+31+" dias");
			break;
			case 11:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Novembro tem "+30+" dias");
			break;
			case 12:
			System.out.println("Ano: "+ano);
			System.out.println("O mes de Dezembro tem "+31+" dias");
			break;


			

			default:
			System.out.println("[- inseriu um numero invalido -]");
			break;



		}
	}

}