//Edimilson Baltazar Baloi Eddy@Emb 2k18
public class ArrayUnidimensional{
	/*Criar um metode=o que define um array de 10 posicoes que preenche a cada posicao com vlores pares*/

	public static void preencherArray(){
		//1.Definir array
		//int tamanho =10;
		int notas[]= new int[10];
		//3.Alteerar o estado da posicao 1,0,5 e9 deve ser igual a posicao

		//2.Imprimir todo o Array
		System.out.println(notas);
		//2.1Elemento na posicão 1
		notas[1]=50;
		notas[0]=100;
		notas[5]=200;

		System.out.println("O Elemento na posicão 1  e' : "+notas[1]);
		System.out.println("O Elemento na posicão 0  e' : "+notas[0]);
		System.out.println("O Elemento na posicão 5  e' : "+notas[5]);
		//A posicao 9 recebe o mesmo valor da posicao 0
		notas[9]=notas[0];

		
		//Estruturas de repeticao
		//Unidimensional
		//.length(){metodo}
		//.length{variavel}


		
		//Desafio 2
//Metodo que gera numero de um ciclo
//metodo 2 impime dados preenchidos(Array)

	}
}