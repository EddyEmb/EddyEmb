///Edimilson Baltazar i11_22/09
import java.util.Scanner;
public class SomaExtenso{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String a="zero";
		String b="um";
		String c="dois";
		String d="tres";
		String e="quatro";
		String f="cinco";
		//String primeiro="";
		//String segundo="";
		//String soma=" ";
		/*espacamento*/System.out.println();

		System.out.println("|_________________________________________|");
		System.out.println("|--#Bem Vindo ao !Programa Soma Extenso#--|");
		System.out.println("|_________________________________________|");
		/*espacamento*/System.out.println();


		System.out.println("|-Insira numerero no Intervalo de um a cinco-|");
		/*espacamento*/System.out.println();

		System.out.println("Insira o primeiro numero em extenso");
		String primeiro=entrada.nextLine();
		System.out.println("Insira o segundo numero em extenso");
		String segundo=entrada.nextLine();
		//0+0
//equal(
//String)
		if (primeiro.equalsIgnoreCase(a) && segundo.equalsIgnoreCase(a)) {
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+a );
		}//0+1
		if (primeiro.equalsIgnoreCase(a) && segundo.equalsIgnoreCase(b) || primeiro.equalsIgnoreCase(b) && segundo.equalsIgnoreCase(a)) {
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+"= "+b );

		}//0+2
		if (primeiro.equalsIgnoreCase(a) && segundo.equalsIgnoreCase(c) || primeiro.equalsIgnoreCase(c) && segundo.equalsIgnoreCase(a)) {
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+c );

		}//0+3
		if (primeiro.equalsIgnoreCase(a) && segundo.equalsIgnoreCase(d) || primeiro.equalsIgnoreCase(c) && segundo.equalsIgnoreCase(a)) {
				
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+d );

		}//0+4
		if (primeiro.equalsIgnoreCase(a) && segundo.equalsIgnoreCase(e) || primeiro.equalsIgnoreCase(e) && segundo.equalsIgnoreCase(a)) {
				
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+e );

		}//0+5
		if(primeiro.equalsIgnoreCase(a) && segundo.equalsIgnoreCase(f) || primeiro.equalsIgnoreCase(f) && segundo.equalsIgnoreCase(a)){
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+f );

		}//1+1
		if (primeiro.equalsIgnoreCase(a) && segundo.equalsIgnoreCase(a)){
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+c );

		}//1+2
		if(primeiro.equalsIgnoreCase(b) && segundo.equalsIgnoreCase(c) || primeiro.equalsIgnoreCase(c) && segundo.equalsIgnoreCase(b)){
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+d );

		}//1+3
		if (primeiro.equalsIgnoreCase(b) && segundo.equalsIgnoreCase(d) || primeiro.equalsIgnoreCase(d) && segundo.equalsIgnoreCase(b)) {
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+e );

		}//1+4
		if (primeiro.equalsIgnoreCase(b) && segundo.equalsIgnoreCase(e) || primeiro.equalsIgnoreCase(e) && segundo.equalsIgnoreCase(b)) {
				
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+f );

		};//2+2
		if(primeiro.equalsIgnoreCase(c) && segundo==c){
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+e );

		}//2+3
		if (primeiro.equalsIgnoreCase(c) && segundo.equalsIgnoreCase(d) || primeiro.equalsIgnoreCase(d) && segundo.equalsIgnoreCase(c)) {
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+f );

		}

		
	
	}
}