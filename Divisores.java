//Edimilson Baltazar Baloi 23-08
import java.util.Scanner;
public class Divisores{
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Insira o numero de deseja saber quais sao os divisores");
		int numero=entrada.nextInt();



		for(int i=1;numero>=i;i++){
			if(numero%i==0){
			System.out.println("Os divisores sao "+i);
			}
		}
		
	}
}