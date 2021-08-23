import java.util.Scanner;
public class TratamentoString{

	public static String converteMinuscula(){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Insira a palavra");
		String palavra=entrada.nextLine();

		String palavraminuscula=palavra.toLowerCase();
		return palavraminuscula;
	} 

	public static char converteMaiuscula(){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Insira a palavra");
		String palavra=entrada.nextLine();

		String palavramaiuscula=palavra.toUpperCase();
		char primeiraletra=palavramaiuscula.charAt(0);
		return primeiraletra;
	}
	public static String palavracap(){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Insira a palavra");
		String palavra=entrada.nextLine();

		String palavraminuscula=palavra.toLowerCase();
		String palavramaiuscula=palavra.toUpperCase();
		int tamanho=palavraminuscula.length();
		char primeiraletra=palavramaiuscula.charAt(0);
		String caplavra=primeiraletra+""+palavraminuscula.substring(1,tamanho);
		return caplavra	;
	} 
	public static String convertecap(){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Insira a palavra");
		String palavra=entrada.nextLine();

		String palavramaiuscula=palavra.toUpperCase();
		
		return palavramaiuscula	;
	}
}