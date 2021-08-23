//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
//Inicio do metodo ATM
public class Atm{
	//Recebe os dados dos Clientes
	public static String credencial(String nib,String codigo){
		//Codigo,Numero de conta,NIB,Nome do Cliente;
		String resultado=" ";

	String basedados="4847,008564784,Edimilson Baltazar";//1458,345789628,004587965842345789628,Silva Sigauque;
	if (nib.equals(basedados.substring(0, basedados.indexOf(","))) && 
                codigo.equals(basedados.substring(basedados.indexOf(",")+1,basedados.lastIndexOf(",")))){
		String cliente=basedados.substring(basedados.lastIndexOf(",") + 1);
		resultado = "           BEM VINDO "+ cliente.toUpperCase();

		 }else{
	 resultado="Credencial INVALIDA";


		 }

	return resultado;
	
	}//Fim

	//Verifica se o Cliente esta registado na BD
	/*private boolean autentificacao(){
	
	}*/
	//Fim
	//Metodo Balaco
	

	public static int consultaSaldo(){
		Scanner entrada=new Scanner(System.in);
		int saldo1=500;
		int saldo=0;Atm.transferencias();
		int saldo2=saldo1-saldo;


		 System.out.println("O seu Saldo actual e de "+saldo2+",00 MTN");
		System.out.println(" _________________________________________");

		 return saldo2;

	}

	//Metodo Levantamentos
	public static int levantamento(){
		Scanner entrada=new Scanner(System.in);
	
		int saldo=Atm.consultaSaldo();

		//System.out.println(Atm.consultaSaldo());
			/*espacamento*/System.out.println();
			//Design inicial;
		/*Espacamento*/ System.out.println();
		System.out.println("|'''''''''''''''''''''''''''''''''''''''''''''''''|");
		System.out.println("|--                 LEVANTAMENTO                --|");
		System.out.println("|_________________________________________________|");
			/*espacamento*/System.out.println();

		System.out.println("Notas disponiveis: 2000,00 MTN");
		System.out.println("Notas disponiveis: 1000,00 MTN");
		System.out.println("Notas disponiveis: 500,00 MTN");
		System.out.println("Notas disponiveis: 200,00 MTN");
		System.out.println("Notas disponiveis: 100,00 MTN");
		System.out.println("Notas disponiveis: 50,00 MTN");

		System.out.println("Digite o montante que deseja Levantar");
		int levantamento=entrada.nextInt();

		 if (levantamento%10!=0) {
		System.out.println("Digite um valor corespondente a uma da opcoes");

		 	}
		else if (levantamento==2000 || levantamento==1000 || levantamento==500 || levantamento==200 || levantamento==100 || levantamento==50) {
			saldo=Atm.consultaSaldo();
			 if (saldo<levantamento) {
		System.out.println("Nao foi possivel efectuar a transissao! Saldo Insuficiente");

			  }else{ saldo=Atm.consultaSaldo()-levantamento;
		System.out.println("Retire as Notas ,....Levantou Com sucesso!\n Levantou "+levantamento+",00 MTN O Seu novo saldo e'"+saldo+",00 MTN");

		 }
		}
    return levantamento;

}
	//Fim

	//Metodo Transferencia
	public static void transferencias(){		
		Scanner entrada=new Scanner(System.in);

		int saldo=Atm.consultaSaldo();
		int numeroconta=0;
		int numeroconta1=0;
		//Design inicial;
		
		/*Espacamento*/ System.out.println();
		System.out.println("|'''''''''''''''''''''''''''''''''''''''''''''''''|");
		System.out.println("|--               TRANSFERENCIAS                --|");
		System.out.println("|_________________________________________________|");
			/*espacamento*/System.out.println();
			System.out.println("Conta:\n1.Minha conta\n2.Conta GEmb\n3.Outras Contas");
			int opcaoconta=entrada.nextInt();

						System.out.println("Digite O Numero da Conta ");
						numeroconta=entrada.nextInt();
					    System.out.println("Digite o Montante");
					    int motanteconta=entrada.nextInt();
					
					//int tamanho=numeroconta.length();
					

				/*if (tamanho!=9) {
						System.out.println("NUMERO DE CONTA INVALIDO,CONTANCTE O BALCAO");
				
					}*/
					if (Atm.consultaSaldo()<motanteconta) {
							System.out.println("Nao foi possivel efectuar a transissao! Saldo Insuficiente");

			 			 }else{	

			 			 	// int Atm.consultaSaldo()="";
			 			 
					numeroconta1=saldo-motanteconta;
							
						System.out.println("Transissao efectuada Com Sucesso Tranferiu "+motanteconta+ " ,00 MTN \n Para conta: "+ numeroconta+"\n O seu saldo actual e'"+(Atm.consultaSaldo()-motanteconta)+",00 MTN");
						}
			 			 	

				//	}
			

		 // return numeroconta1;
		
			}


			

	//Fim

	/*

	//Metodo Movimento
	public static void movimentos(){

	}//Fim

	//Metodo Pagamento
	public static void pagamentos(){

	}//Fim

	//Metodo Credilec
	public static void credilec(){

	}//Fim

	//Metodo Recargas
	public static void recargas(){

	}//Fim

	//Metodo outros servicoes
	public static void outrosServicos(){
*/
	//Fim
}


