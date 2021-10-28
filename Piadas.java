//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Piadas{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Bem VIndo ao Programa Piadas");
				System.out.println("1.Mocambique");
				System.out.println("2.Academia");
				System.out.println("3.Dialogos");
				System.out.println("4.Religiosa");
				System.out.println("5.Referencia");
				System.out.println("6.Actualidade");
				System.out.print("Opcao:");
				int opcao=entrada.nextInt();

			if (opcao==1) {
			System.out.println("A unica Maquina segunda mao que o Mr.Bow tem e' a Liloca!");

			}if (opcao==2) {
			System.out.println("Ha porque feiticeiro e so' aquele que voa,e aquele que passa aula de quinta-feira para sabado!?");
				
			}if (opcao==3) {
			System.out.println("Eu sou o tipo de mulher que quer casar com um homen virgem.");
			System.out.println("R:Nunca vi uma vaga de emprego que o requsito era \"nao ter experiencia\"");
				
			}if (opcao==4) {
			System.out.println("\"E Deus falou para noe' :\n \"Faz Backup que vou formatar\"");
				
			}if (opcao==5) {
			System.out.println("Peco teu codigo quer editar e dar docente!! :\n Bro! -\"We don't do that here \"");
				
			}if (opcao==6) {
				System.out.println("  -Quando convidas-me,pagas");
			System.out.println("  -Quando convido-te,pagas");
			System.out.println("  -Quando combinamos,pagas");
			System.out.println("  -Quando vou sozinha,pagas");
			}if (opcao>6 || opcao<1) {
				System.out.println("Opcao inexistente ,Adeus!");
			}


		
	}
}