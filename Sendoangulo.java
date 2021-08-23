//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Sendoangulo{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Sen0");
		System.out.println("Digite o angulo que desejas saber o seno ");
		double angulo=entrada.nextDouble();
		double seno =Math.sin(angulo);
		System.out.println("O seno do angulo="+angulo+" e' "+seno);

	}
}




