//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
//Imprime o resultado da divisao de valores de uma String
public class TestaDivisaoString{
	public static void main(String[] args) {
		//String Dados
		String operacao="14/98=";
			//Dividendo 14
			double dividendo=Double.parseDouble(operacao.substring(0,operacao.indexOf("/")));
			//divisor 98
			double divisor=Double.parseDouble(operacao.substring(operacao.indexOf("/")+1,operacao.indexOf("=")));
			//Resultado 10/98
			double resultado=dividendo/divisor;
		System.out.println("O resultado de "+operacao+resultado);
	}
}