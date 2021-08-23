//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class MaterialRadioActivo{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		final int TEMPO	=50;
		System.out.println("Bem vindo ao Programa Determina o tempo necessario para desaparecimento de uma particula");
		System.out.println("");
	System.out.println("Digite a massa");
	double massa=entrada.nextDouble();
	int temp=0;
	do{
		massa=massa/2;
		temp=temp+TEMPO;
System.out.println("A massa e' de massa="+massa+"gramas");
	}while(massa>0.05);
	System.out.println("O tempo necessario sera' de Tempo="+temp+"segundos");
	}
}