//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;


public class Menu{
	
	public static void menu(){
		Scanner entrada=new Scanner(System.in);

		String conta="";
		String codigo="";
		String resultado="";
		int sair;
		double saldo=0;
//conta="008564784";
//codigo="4847";
	
		for (int vez=0;vez<3;vez++) {
			/*espacamento*/System.out.println();
		System.out.println(" ______________________________");
			System.out.println("Digite o numero da sua conta");
			conta=entrada.nextLine();
		System.out.println(" ___________________          ");
			System.out.println("Digite o seu codigo");
			codigo=entrada.nextLine();
		System.out.println(" ___________________          ");

//do{	
			resultado=Atm.credencial(codigo,conta);
			if (!resultado.equals("Credencial INVALIDA")) {
			/*espacamento*/System.out.println();
			
			System.out.println(Atm.credencial(codigo,conta));
			System.out.println("	PORFAVOR SELECIONE A OPCAO DESEJADA");

		System.out.print(" ___________________          ");System.out.println(" ___________________ ");
		System.out.print("|1.Consulta de Saldo|         ");System.out.println("|   5.Pagamentos    |");
		System.out.print("|___________________|         ");System.out.println("|___________________|");
			/*espacamento*/System.out.println();
 	    System.out.print(" ___________________          ");System.out.println(" ___________________ ");
		System.out.print("| 2.Levantamento    |         ");System.out.println("|    6.Credelec     |");
		System.out.print("|___________________|         ");System.out.println("|___________________|");
			/*espacamento*/System.out.println();
 	    System.out.print(" ___________________          ");System.out.println(" ___________________ ");
		System.out.print("| 3.Transferencias  |         ");System.out.println("|    7.Recargas     |");
		System.out.print("|___________________|         ");System.out.println("|___________________|");
			/*espacamento*/System.out.println();
 	    System.out.print(" ___________________          ");System.out.println(" ___________________ ");
		System.out.print("|  4.Movimentos     |         ");System.out.println("| 8.Outros Servicos |");
		System.out.print("|___________________|         ");System.out.println("|___________________|");
			/*espacamento*/System.out.println();
 

		//selecao da opcao
			int opcao=entrada.nextInt();
			
switch (opcao){
	case 1:
			Atm.consultaSaldo();
			/*espacamento*/System.out.println();
			/*espacamento*/System.out.println();

			break;
	case 2:
	
		Atm.levantamento();
			/*espacamento*/System.out.println();
			/*espacamento*/System.out.println();

			Menu.menu();		
			break;
	case 3:
	
		Atm.transferencias();
			/*espacamento*/System.out.println();
	   		/*espacamento*/System.out.println();
	
		break;
	/*case 4:
		Atm.movimentos();
		break;
	case 5:
		Atm.pagamentos();
		break;
	case 6:
		Atm.credilec();
		break;
	case 7:
		Atm.recargas();
		break;
	case 8:
		Atm.outrosServicos();
		break;*/
	default:
			System.out.println("Digite um numero referente a uma opcao Existente");
			break;
}
				break;	
			}else if(vez==2){
			System.out.println("Atingiu o limite maximo de tentativas");
			System.out.println("Porfavor Contactar o balcao!");
			return;
			}
		}

}
}