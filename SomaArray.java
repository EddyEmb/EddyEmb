//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;

public class SomaArray{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String[][] nome=new String[3][3];
		for (int i=0;i<3 ;i++ ) {
			String num=String.valueOf(i);
				nome[i]=num;
			for (int j=0;i<3 ;j++ ) {
				System.out.println("Digite o seu nome:");
				String nome1=entrada.nextLine();
				nome[j]=nome1;
			}
		}System.out.println(nome);

	}
}