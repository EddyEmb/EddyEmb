import java.util.Scanner;
public class Idade{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite o seu ano de nascimento");
		int ano=entrada.nextInt();
		int idade=2018-ano;
		if (idade<15) {
		System.out.println("Es uma crianca de "+idade+" anos.");

		}if (idade>18 && idade <27) {
		System.out.println("Es um adolescete de "+idade+" anos.");
			
		}
		if(idade>27) {
		System.out.println("Es um Adulto  de "+idade+" anos.");
				
			}if (idade>50) {
		System.out.println("Es um idoso de "+idade+" anos.");
				
			}
	}
}