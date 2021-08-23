//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class SomaData{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite a Data no formato dd/m-yy/");
	String data=entrada.nextLine();
	String sair;
		
			if (data.contains("/")) {
				if (data.contains("-")) {
					
			int a=Integer.parseInt(data.substring(0,data.indexOf("/")));
			int b=Integer.parseInt(data.substring(data.indexOf("/")+1,data.indexOf("-")));
			int c=Integer.parseInt(data.substring(data.indexOf("-")+1,data.lastIndexOf("/")));
			
			int soma=a+b+c;
			System.out.println("O valor da soma de "+data+" e' "+soma);
					}
				
				}
	}
}