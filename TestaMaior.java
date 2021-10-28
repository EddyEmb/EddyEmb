//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner; 
public class TestaMaior{
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int num =entrada.nextInt();
		System.out.println("Digite o segundo numero");
		int num2 =entrada.nextInt();

	int k=maior(num,num2);
	System.out.println("O maior entre "+num+" e "+num2+" e' "+k);
	}
	public static int maior(int numero1,int numero2){
		int resultado;
		if(numero1>numero2){
			resultado=numero1;
		}
		else
			resultado=numero2;
		return resultado;
	}
}
//Tp01 7 pontos por desafio(6x7)
//21pontos
//tp01 +15pontos
//tpo02
//DF08
//