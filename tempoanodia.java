//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class tempoanodia{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Convert ano para dias");
		System.out.println("Digite o valor dos anos");
		double ano=entrada.nextDouble();
		if (ano%4==0) {
			double dias =ano*366;
		System.out.println("O valor de "+ano+"anos em dias equivale a "+dias+"dias");
		}else {
			double dias =ano*365;
		System.out.println("O valor de "+ano+"anos em dias equivale a "+dias+"dias");
		}
		

	}
}




