//Edimilson Baltazar Baloi 23-08
import java.util.Scanner;
public class EnergiaCinetica{
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		double energiaC;
		System.out.println("Insira o valor de massa");
		double m=entrada.nextInt();
		System.out.println("Insira o valor da velocidade");
		double v=entrada.nextInt();
		if(m!=0){
			if(v!=0){
				energiaC=m*Math.pow(v,2)/2;
				System.out.println("A Energia Cinetica de uma particula de massa "+m+" e uma velocidade "+v+" e"+energiaC+" m/s^2");
			}
			else {
				System.out.println("Insira o valor da velocidade e da massa diferentes de 0");
			}
		}
		
		
		
	}
}