//Edimilson Baltazar Baloi Eddy@Emb 2k18
	import java.util.Scanner;

public class TestaReplaceAvancado{

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);

		System.out.println("................................................");

		System.out.println("[|=========================================|]");
		System.out.println("||-Bem  Vindo ao Programa Alterar da Frase-|]");
		System.out.println("[|=========================================|]");
		System.out.println("................................................");

		System.out.println("[Insira uma Frase]");
		String frase=entrada.nextLine();
		int tamanho=frase.length()-1;

		System.out.println(" ====================");
		System.out.println("|Oque deseja alterar: ");
		System.out.println(" ====================");

		System.out.println("................................................");
		     
		System.out.println("=======================");
		System.out.println("-|1.Alterar um Caracter|:");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("-|2.Alterar uma Palavra|:");
		System.out.println("=======================");
	
	 
	
     
		System.out.println("______");
		System.out.print(" Opcao|: ");
		int opcao=entrada.nextInt();
		System.out.println("................................................");
		
switch(opcao){
		case 1:
		System.out.println("................................................");
		System.out.println(frase);
		System.out.println("................................................");

		System.out.println("[Insira o numero equivalente a posicao do Caracter[0-"+tamanho+"]]");
		System.out.println("Opcao|: ");
		int caracter=entrada.nextInt();
		
		String novocaracter=entrada.nextLine();
		
		System.out.println("[ Insira o novo Caracter ]");
		 novocaracter=entrada.nextLine();
		
		System.out.println("[A nova frase é ]:- "+frase.replaceFirst(frase.charAt(caracter)+"",""+novocaracter));
		break;

		case 2:
		System.out.println("[Insira a Palavra que desejas substituir]");
		String palavra=entrada.nextLine();
		 palavra=entrada.nextLine();

		System.out.println("[Insira a nova Palavra ]");
		String novapalavra=entrada.nextLine();

		String novafrase=frase.replaceFirst(palavra,novapalavra);
		System.out.println(novafrase);
		break;
		default:
		System.out.println("[- Selecionou uma Opcao inexistente!! -]");

	}	
		System.out.println("|_________________________________________________|");
		System.out.println("  --------------Fim do Programa Adeus!--------------|");
		System.out.println("|________Copyright reserved @byEmbCorp2k18________|");

		
			
	}
}

