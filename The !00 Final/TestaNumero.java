//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class TestaNumero{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero;
		System.out.println("|''''''''''''''''''''''''''''''''''''''''''''''''''''''|");
		System.out.println("|--#Bem vindo ao !Programa Informacao Sobre o numero!#-|");
		System.out.println("|______________________________________________________|");

		System.out.println("[Digite um numero!]");
		numero=entrada.nextInt();

		if (numero%2==0) {
			System.out.println("O numero [ "+numero+" ] e' par !");
		}else{
			System.out.println("O numero [ "+numero+" ] e' impar !");
			 	}
			if (numero==0) {
			System.out.print("O numero [ Zero ] so e' divisivel por ele mesmo!");
				
			 }else{
			System.out.print("O numero [ "+numero+" ] e' divisivel por !");
			 	
			  for (int i=1;numero>i ;i++ ) {
			 	if (numero%i==0) {
			System.out.print(i+",");			
			 }

		}
		System.out.print("e por ele mesmo ( "+numero+" ).");

		}
		System.out.println("");


		System.out.println("|_________________________________________________|");
		System.out.println("------------#Programa terminado, Adeus!#-----------");
		System.out.println("|________Copyright reserved @byEmbCorp2k18________|");
	}

}
