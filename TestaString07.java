//Edimilson Baltazar Baloi Eddy@Emb 2k18
//Aula prática 07
public class TestaString07{
	public static void main(String[] args){
		//crie uma class em java que permita transformar cada caracter em letras captais de uma palavra inserida por teclado o exercicio so termina quando o usuario preciona a tecla enter
		//crie um programa que permita transformar apenas as iniciais de uma sequencia de caracteres inserido por teclado;
		
		//Declarar e Inicializar /Palvra(programacaojavai)
		String palavra="programacaojava i";
		
		//Estrutura de Repetição
		
		//2.1 inicializar e declara com zero a variavel contador
		int contador=0;
		String caracter=" ";
		while(contador<palavra.length()){
			//2.2 Para cada caracter da palavra tranformar em maiúscula 
			caracter=(caracter +palavra.charAt(contador)).toUpperCase();
			 
			 System.out.println(""+caracter);
			contador=contador+1;
			
			
		}
	}
}