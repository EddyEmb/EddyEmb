//Edimilson Baltazar I11-2k18
//TestaMetodos(Main)

//importar a classe Scanner;
import java.util.Scanner;

//Sintax do codigo Main
public class Metodo{
	public static void main(String[] args) {
		//Criar um objecto de entrada para classe Scanner;
		Scanner entrada=new Scanner(System.in);

		//Design inicial;
		/*Espacamento*/ System.out.println();
		System.out.println("|'''''''''''''''''''''''''''''''''''''''''''''''''|");
		System.out.println("|--#Bem vindo ao !Programa Calcula Area(Metodo)!#-|");
		System.out.println("|_________________________________________________|");

		//Declaracao de variavel controladora do metodo #Main;
		int continuar;
		int opcao1;

		//Estrutura de Repeticao controladora do #continuar;
			do{
				
				//Referenciacao da -class e do -metodo #Menu;
				System.out.println("!Digite 1 para Calcular Areas!");
				System.out.println("!Digite 2 para Calcular Somatorio em Extenso!");

				opcao1=entrada.nextInt();
				switch(opcao1){
					case 1:
					Menu.menu();
					break;
					case 2:
					Menu.soma();
					break;
					default:
					System.out.println("!Insira numeros correspondentes a uma opcao existente!");
				}
					/*Espacamento*/System.out.println();

		//Guia dos Passos a Seguir;
		System.out.println("|-------------------------------------------------|");
			System.out.println("Clique zero para terminar");
		System.out.println("|-------------------------------------------------|");
			System.out.println("Clique 1 para continuar");
		System.out.println("|-------------------------------------------------|");

			//Recebendo o passo a seguir por teclado;
			continuar=entrada.nextInt();
		

		//Condicao de paragem do ciclo;
		}while(continuar!=0);

		//Design terminal;
		System.out.println("|_________________________________________________|");
		System.out.println("----------#Calculadora terminada, Adeus!#----------");
		System.out.println("|________Copyright reserved @byEmbCorp2k18________|");
	}
}