//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Partidos{
	
	public static void Frelimo(){
		Scanner entrada=new Scanner(System.in);
		int opccao;
		System.out.println("Bem Vindo ao Banco de dados Frelimo");
		System.out.println("Oque deseja saber!?");
		System.out.println("1.Presidente Actual do partido.");
		System.out.println("2.Presidentes Antecessores.");
		System.out.println("3.Anos de Mandato.");
		System.out.print("opccao:");
		opccao=entrada.nextInt();
		switch (opccao) {
			case 1:
			System.out.println("nota:Partido no poder;");

		System.out.println("Sua Excelencia Felipe Jacinto e' o Presidente do Partido\n e Presidente do pais.");
			break;
			case 2:
		System.out.println("Sua Excelencia Almando Emilio Guebuza");

			break;
			case 3:
			break;
			default:
				System.out.println("Opccao fora do intervalo!");
				
		}


	}public static void Renamo(){
		Scanner entrada=new Scanner(System.in);
		int opccao;
		System.out.println("Bem Vindo ao Banco de dados Renamo");
		System.out.println("Oque deseja saber!?");
		System.out.println("1.Presidente Actual do partido.");
		System.out.println("2.Presidentes Antecessores.");
		System.out.println("3.Anos de Mandato.");
		System.out.print("opccao:");
		opccao=entrada.nextInt();
		switch (opccao) {
			case 1:
			System.out.println("nota:Maior oposicao");

		System.out.println("Presidente do Partido indefinido");
		
			break;
			case 2:
		System.out.println("Sua Excelencia Maceta Makadle Dlakhama (Ja Falecido)");
			break;
			case 3:
			break;
			default:
				System.out.println("Opccao fora do intervalo!");
				
		}


	}
	public static void Mdm(){
		Scanner entrada=new Scanner(System.in);
		int opccao;
		System.out.println("Bem Vindo ao Banco de dados MDM");
		System.out.println("Oque deseja saber!?");
		System.out.println("1.Presidente Actual do partido.");
		System.out.println("2.Presidentes Antecessores.");
		System.out.println("3.Anos de Mandato.");
		System.out.print("opccao:");
		opccao=entrada.nextInt();
		switch (opccao) {
			case 1:
		System.out.println("Sua Excelencia Davis Simango e' o Presidente do Partido");
			break;
			case 2:
			break;
			case 3:
			break;
			default:
				System.out.println("Opccao fora do intervalo!");
				
		}


	}
}