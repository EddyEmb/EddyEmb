//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class ProgramaProbabilidade{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Probabilidade");
		System.out.println("Digite o numero de casos Possiveis");
		double casosp=entrada.nextDouble();
		System.out.println("Digite o numero de casos Favoraveis");
		double casosf=entrada.nextDouble();
		double probabilidade =casosf/casosp;
		System.out.println("A probabilidade e' igual a "+probabilidade);
		System.out.println("Ou seja P(a)="+probabilidade*100+"%");

	}
}




