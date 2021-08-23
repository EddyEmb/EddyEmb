//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class AreaCircunferencia{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Area da Circunferencia");
		System.out.println("Digite o raio ");
		double raio=entrada.nextDouble();
		double area =Math.PI*raio;
		System.out.println("A are  de uma circunferencia de raio= "+raio+" e' "+area);

	}
}




