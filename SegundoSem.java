//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class SegundoSem{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem Vindo ao programa 2.Semestre");
		System.out.println("Escolha Uma das Opcoes:");
		System.out.println("1.Analise Matematica");
		System.out.println("2.Fisica II");
		System.out.println("3.Tecnicas de Comunicacao");
		System.out.println("4.Programacao I");
		System.out.println("5.Probabilidade & Estatistica");
		System.out.println("6.Desenho Esquematico");
		int opcao=entrada.nextInt();
	
		switch (opcao) {
			case 1:
			System.out.println("Analise Matematica");
			System.out.println("1.Docente de Pratica e Teoria");
			int opcaoa=entrada.nextInt();
			if (opcaoa==1) {
				System.out.println("Dr.Mario Getimane");
			}else{
				System.out.println("Opcao inexixtente Adeus!");
			}
			break;
			case 2:
			System.out.println("Fisica II");
			System.out.println("1.Docente de Pratica \n2.Docente de Teoria");
			int opcaof=entrada.nextInt();
			if (opcaof==1) {
				System.out.println("Dr.Adriano Sacate");
			}else if (opcaof==2) {
				System.out.println("Dra.Joana Mabote");
			}else {
				System.out.println("Opcao inexixtente Adeus!");
				
			}
			break;
			case 3:
			System.out.println("Tecnicas de Comunicacao");
			System.out.println("1.Docente de Pratica \n2.Docente de Teoria");
			int opcaot=entrada.nextInt();

			if (opcaot==1) {
				System.out.println("Dr.Aurelio Cuna");
			}else if (opcaot==2) {
				System.out.println("Dr.Calado");
			}else {
				System.out.println("Opcao inexixtente Adeus!");
				
			}
			break;
			case 4:
			System.out.println("Programacao I");
			System.out.println("1.Docente de Pratica \n2.Docente de Teoria");
			int opcaop=entrada.nextInt();

			if (opcaop==1) {
				System.out.println("Dr.Danilo Jo");
			}else if (opcaop==2) {
				System.out.println("Dr.Edvaldo Maesh");
			}else {
				System.out.println("Opcao inexixtente Adeus!");
			}
				break;

			case 5:
			System.out.println("Probabilidade & Estatistica");
			System.out.println("1.Docente de Pratica \n2.Docente de Teoria");
			int opcaoap=entrada.nextInt();

			if (opcaoap==1) {
				System.out.println("Dr.Ilal");
			}else if (opcaoap==2) {
				System.out.println("Dra.");
			}else {
				System.out.println("Opcao inexixtente Adeus!");
				
			}break;
			case 6:
			System.out.println("Desenho Esquematico");
			System.out.println("1.Docente de Pratica e Teoria");
			int opcaoad=entrada.nextInt();

			if (opcaoad==1) {
				System.out.println("Dr.Celio Perreira");
			}else {
				System.out.println("Opcao inexixtente Adeus!");
				
			}default:
				System.out.println("Opcao inexixtente Adeus!");
			break;
		}
			
				
	}
}