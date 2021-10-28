//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Politica{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);	
		int opccao;	
				System.out.println("Bem Vindo ao Programa #Politica");
				System.out.println("Selecciona o numero do Partido que deseja ter informacoes : ");

				System.out.println("1.Frelimo");
				System.out.println("2.Renamo");
				System.out.println("3.MDM");
				opccao=entrada.nextInt();

				switch (opccao) {
					case 1:
							Partidos.Frelimo();

					break;
					case 2:
							Partidos.Renamo();

					break;
					case 3:
							Partidos.Mdm();

					break;
					default:
				System.out.println("Opccao fora do intervalo!");

					
				}

	}
}