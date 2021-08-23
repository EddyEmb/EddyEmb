//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class SomaMulti{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Adicao Sucessiva");
		System.out.println("Digite um numero");
		double numero=entrada.nextDouble();
		System.out.println("Digite um segundo  numero");
		double numero1=entrada.nextDouble();
		int soma=0;
		do{
			soma=(int)numero+soma;
			numero1--;
			System.out.println("Os multiplos de "+numero+"  sao:"+soma);
		}while (numero1>=numero );
		System.out.println("O numero "+numero+"adicionado "+numero1+" vezes e' igual a "+soma );
		
	}
}




