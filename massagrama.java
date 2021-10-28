//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class massagrama{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Convert Grama para kg");
		System.out.println("Digite o valor das Gramas");
		double grama=entrada.nextDouble();
		double kg =grama*0.001;
		System.out.println("O valor de "+grama+"g em kg equivale a "+kg+"kg");

	}
}




