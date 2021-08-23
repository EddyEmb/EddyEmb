//Edimilson Baltazar Baloi 
import java.util.Scanner;
public class Ordemdecrescente{
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite o numero 1");
		double numero1=entrada.nextDouble();
		System.out.println("Digite o numero 2");
		double numero2=entrada.nextDouble();
		System.out.println("Digite o numero 3");
		double numero3=entrada.nextDouble();

		if (numero1>numero2) {
			if (numero2>numero3) {
			System.out.println("A ordem decrescente e' "+numero1+","+numero2+","+numero3);
				
			}
			
		}else if (numero3>numero2) {
			System.out.println("A ordem decrescente e' "+numero2+","+numero1+","+numero3);
				
			
		}else if (numero1<numero3) {
			System.out.println("A ordem decrescente e' "+numero1+","+numero2+","+numero1);
				
			}
		else {
			
		}

		if (numero1>numero2 && numero1>numero3 && numero2<numero3) {
			System.out.println("A ordem decrescente e' "+numero1+","+numero3+","+numero2);
			
		}if ( numero1<numero2 && numero1>numero3 && numero2>numero3) {
			System.out.println("A ordem decrescente e' "+numero2+","+numero2+","+numero3);
			
		}if (numero1>numero2 && numero1<numero3 && numero2<numero3) {
			System.out.println("A ordem decrescente e' "+numero2+","+numero3+","+numero1);
			
		}if (numero1<numero2 && numero1<numero3 && numero2>numero3) {
			System.out.println("A ordem decrescente e' "+numero1+","+numero2+","+numero3);
		
		}
	}
}


