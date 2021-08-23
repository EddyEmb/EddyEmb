//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Palavra{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		
		System.out.println("A primeira captalizada: "+TratamentoString.palavracap());
		System.out.println("Toda Palavra em minuscula: "+TratamentoString.converteMinuscula());
		System.out.println("A primeira letra minuscula: "+TratamentoString.converteMaiuscula());
		System.out.println("Toda Palavra em Maiuscula: "+TratamentoString.convertecap());
		

	}
}
