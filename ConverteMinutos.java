//Edimilson Baltazar Baloi 23-08
import java.util.Scanner;
public class ConverteMinutos{
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);

    	double minuto;
		double segundo;
		do{
	
		System.out.println("#--Bem Vindo ao Conversor de Tempo#--");
		System.out.println("#------------------------------------");
		System.out.println("Insira o valor dos Segundos  que deseja converter para Minutos:");
		segundo=entrada.nextInt();
		System.out.println("#--------------------------------------------------------------");

			minuto=segundo/60;
			System.out.println(segundo+" segundos equivale a "+minuto+" minutos.");
		System.out.println("#--------------------------------------------------------------");
		
		}while (segundo!=0);

	}
}