//Edimilson Baltazar I11-2k18
//TestaMetodos(Metodos)

//importar a classe Scanner;
import java.util.Scanner;

//Sintax da Class Metodos
public class  Metodos{
		//Sintax do Metodo
	//Area do Rectangulo;
	//Oque vai retornar e declaracao do tipo da variavel 
	public static double areaRectangulo(){
		//Criar um objecto de entrada para classe Scanner;
		Scanner entrada=new Scanner(System.in);
		/*Espacamento*/System.out.println();

		//Receber dados introduzidos por teclado
		//Comprimento
		System.out.println("Insira o comprimento: ");
		double comprimento=entrada.nextDouble();
		//largura
		System.out.println("Insira o largura: ");
		double largura= entrada.nextDouble();

		//Calculo da Area
		double area=largura*comprimento;
		
		//retorno
		return area;
	
	} 
	//Oque vai retornar e declaracao do tipo da variavel 
	public static double areaCircunferencia(){
		//Criar um objecto de entrada para classe Scanner;
		Scanner entrada=new Scanner(System.in);
		
		//Receber dados introduzidos por teclado
		//Area da Circunferencia
		System.out.println("Area da Circunferencia");
		//Raio
		System.out.println("Insira o raio: ");
		double raio= entrada.nextDouble();
		//Calculo da Area
		double area=2*Math.PI*Math.pow(raio,2);
		
		//retorno
		return area; 
	}
	//Oque vai retornar e declaracao do tipo da variavel 
	public static int areaQuadrado(){
		//Criar um objecto de entrada para classe Scanner;
		Scanner entrada=new Scanner(System.in);

		//Receber dados introduzidos por teclado
		//Area da Quadrado
		System.out.println("Area da Quadrado");
		//lado
		System.out.println("Insira o lado: ");
		int lado=entrada.nextInt();
		//Calculo da Area
		int area=lado*lado;
		
		//retorno
		return area;
	}
	//Oque vai retornar e declaracao do tipo da variavel 
	public static int areaTriangulo(){
		//Criar um objecto de entrada para classe Scanner;
		Scanner entrada=new Scanner(System.in);
		
		//Receber dados introduzidos por teclado
		//Area da Triangulo
		System.out.println("Area da Triangulo");
		//base
		System.out.println("Insira a base: ");
		int base=entrada.nextInt();
		//Altura
		System.out.println("Insira a altura: ");
		int altura=entrada.nextInt();
		
		//Calculo da Area
		int area=altura*base/2;

		 return area;
	}

	public static String somatorio(){
		//Criar um objecto de entrada para classe Scanner;
				Scanner entrada=new Scanner(System.in);
		//Declaracao de variavel String;
		String a="zero";
		String b="um";
		String c="dois";
		String d="tres";
		String e="quatro";
		String f="cinco";
		String soma="";
		

		System.out.println("|-Insira numerero no Intervalo de um a cinco-|");
		/*espacamento*/System.out.println();

		System.out.println("Insira o primeiro numero em extenso");
		String primeiro=entrada.nextLine();
		System.out.println("Insira o segundo numero em extenso");
		String segundo=entrada.nextLine();
		//0+0
		if (primeiro.equalsIgnoreCase(a) && segundo.equalsIgnoreCase(a)) {
			
			
			System.out.println("a resultado de "+primeiro+" + "+segundo+" = "+a);
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
		
		return soma;
	}
}