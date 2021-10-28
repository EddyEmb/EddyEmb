//Edimilson Baltazar Baloi
import java.util.Scanner;
public class TestaArrayMedias{
	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		String nomes[]=new String[3];

		System.out.println("Insira o Nome do Aluno ");
		String nome=entrada.nextLine();

		System.out.println("Digite nota 1");
		int nota1=entrada.nextInt();
		System.out.println("Digite nota 2");
		int nota2=entrada.nextInt();
		System.out.println("Digite nota 3");
		int nota3=entrada.nextInt();
		

		double media=(nota1+nota2+nota3)/3;
		String str = Double.toString(media);

		 nomes[0]="Nome: ";
		 nomes[1]=nome+",";
		 nomes[2]=str;

		System.out.println(nomes[0]+nomes[1]+nomes[2]);
	}	
		
		
}
