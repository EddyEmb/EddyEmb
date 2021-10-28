//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TiposdeDivisao{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		System.out.println("Bem Vindo ao Programa Tipos de Divisao");
		double divisor;
		double dividendo;
		int opccao;
		int priparte;

		System.out.println("Digite o divisor :");
		divisor=entrada.nextDouble();
		System.out.println("Digite o dividendo :");
		dividendo=entrada.nextDouble();


		System.out.println("Seleccione uma opccao: ");
		System.out.println("1.Resultado da Divisao: ");
		System.out.println("2.Parte inteira da Divisao: ");
		System.out.println("3.Resto da divisao: ");
		opccao=entrada.nextInt();

		
		if (opccao==1) {
		System.out.println("O Resultado da Divisao e' : "+divisor/dividendo);	
		
		}else if (opccao==2) {
			priparte=(int)(divisor/dividendo);
		System.out.println("O Resultado da parte inteira e' : "+priparte);	
	
		}else if (opccao==3) {
		System.out.println("O Resultado do Resto da divisao e' : "+divisor%dividendo);	
			
		}


	}
}