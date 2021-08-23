//Edimilson Baltazar I11-2k18
//TestaMetodos(Menu)

//importar a classe Scanner;
import java.util.Scanner;

//Sintax da Class #Menu
public class Menu{

	public static void menu(){
		//Criar um objecto de entrada para classe Scanner;
		Scanner entrada=new Scanner(System.in);

		//Declaracao de variavel controladora do #Menu;
		int menu,continuar;

		//Estrutura de Repeticao controladora do #MenuPrincipal;
	do{
		//Guia
		System.out.println("####### Escolha uma das opcoes: ############");
		/*Espacamento*/System.out.println();

		//Guia dos Passos a Seguir;
		System.out.println("Insira 1 para Calcular a Area do Rectangulo: ");
		System.out.println("Insira 2 para Calcular a Area da Circunferencia: ");
		System.out.println("Insira 3 para Calcular a Area do Quadrado: ");
		System.out.println("Insira 4 para Calcular a Area do Triangulo: ");
		/*Espacamento*/System.out.println();

		//Variavel que recebe as opcoes;
		System.out.print("#opcao: ");
		menu=entrada.nextInt();

		//Estrutura de Seleccao que gerencia o #Menu
		switch (menu) {
			case 1:
			//Area do rectangulo
			System.out.println("A area do Rectangulo e : "+Metodos.areaRectangulo());	
			break;
			case 2:
			//Area do Circunferencia
			System.out.println("A area da Circunferencia e : "+Metodos.areaCircunferencia());
			break;
			case 3:
			//Area do Quadrado
			System.out.println("A area do Quadrado e : "+Metodos.areaQuadrado());
			break;
			case 4:
			//Area do Triangulo
			System.out.println("A area do Triangulo e : "+Metodos.areaTriangulo());
			break;
			default:
			//Caso o usuario digite um numero nao listado(sem opcao);
				System.out.println(" Insira uma opcao dentro do intervalo [1,4]");
				System.out.println("|------------------------------------------|");
}
		//Condicao de paragem do ciclo;
	}while(menu>4);

	
	}
	public static void soma(){
				//Criar um objecto de entrada para classe Scanner;
		Scanner entrada=new Scanner(System.in);

		
		
		/*espacamento*/System.out.println();


					System.out.println("|_________________________________________|");
					System.out.println("|--#Bem Vindo ao !Programa Soma Extenso#--|");
					System.out.println("|_________________________________________|");
					/*espacamento*/System.out.println();
			System.out.println(Metodos.somatorio());
			
		
	}


}