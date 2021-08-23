//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Nomecompleto{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite o seu nome e sobrenome:");
	String nomecompleto=entrada.nextLine();
	
			String nome=nomecompleto.substring(0,nomecompleto.indexOf(" "));
			String sobrenome=nomecompleto.substring(nomecompleto.indexOf(" ")+1,nomecompleto.lastIndexOf(""));
		System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome);
			
				
	}
}