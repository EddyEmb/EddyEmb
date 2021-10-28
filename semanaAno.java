//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class semanaAno{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao Programa Convert Semanas para anos");
		System.out.println("Digite o valor das Semanas");
		double semanas=entrada.nextDouble();
		double ano =semanas*0.0191780822;
		System.out.println("O valor de "+semanas+" semanas equivalem a "+ano+" anos");

	}
}




