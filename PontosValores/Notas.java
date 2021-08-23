//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Notas{
	public static void Valor() {
	    Scanner entrada=new Scanner(System.in);
	    System.out.println("Digite a nota ");
	    int nota=entrada.nextInt();
	    System.out.println("Digite a Pontuacao maxima ");
	    double maxima=entrada.nextInt();
	    double valor=nota/maxima*20;
    if (nota>(maxima)/2) {
	    	System.out.println("Bom Aproveitamento(Positiva) Nota: "+valor+" de 20");
	    }else {
	    	System.out.println("Mau Aproveitamento(Negava) Nota: "+valor+" de 20");
	    	
	    }

	}
}