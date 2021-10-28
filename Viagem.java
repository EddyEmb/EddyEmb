//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner; 
public class Viagem{
	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	System.out.print("Digite o tempo de viagem ");
	double tempo=entrada.nextDouble();
	System.out.println("Digite a Velocidade Media");
	double velocidade=entrada.nextDouble();

	double distancia=tempo*velocidade;
	double litrosU=(int)distancia/12;

	System.out.println("A velocidade media da viagem foi de "+velocidade+";");
	System.out.println("O tempo de viagem foi de "+tempo+";");
	System.out.println("A distancia percorrida foi de "+distancia+"km;");
	System.out.println("Foram gastos "+litrosU+"L durante a viagem.");
}



}
