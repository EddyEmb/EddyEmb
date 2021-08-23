//Edimilson Baltazar Baloi Eddy@Emb 2k18
import java.util.Scanner;
public class Salario{
	public static void main(String[]args){
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite  as horas trabalhadas no mes");
		int horasdetrabalho = entrada.nextInt();
		
		System.out.println("Digite o Valor das horas trabalhada");
		double valorporhora = entrada.nextDouble();
		
		System.out.println(" Digite o porcentual de desconto");
		double perdesconto = entrada.nextDouble();
		double salariobruto=horasdetrabalho*valorporhora;
		double totaldesconto=(perdesconto/100)*salariobruto;
		double salarioliquido=salariobruto-totaldesconto;
		
	
		
		System.out.println("\nHoras trabalhadas=" + horasdetrabalho +"; \nSalario Bruto= "+ salariobruto + ";\nDesconto= "+ totaldesconto +"%"+"; \nSalario Liquido=" +(int) salarioliquido);	
		
	}
	}