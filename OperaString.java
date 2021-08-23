//Edimilson Baltazar Baloi Eddy@Emb 2k18
public class OperaString{

	public static void main(String[]args){
		String equacao="10+(6/2)";
		System.out.println("Insira O Primeiro Numero");
	
			int parte1=Integer.parseInt(equacao.substring(0,equacao.indexOf('+')));
			int parte2=Integer.parseInt(equacao.substring(equacao.indexOf('(')+1,equacao.indexOf('/')));
			int part3=Integer.parseInt(equacao.substring(equacao.indexOf('/')+1,equacao.indexOf(')')));
			double resultado=parte1+(parte2/part3);
			System.out.println("O Resultado de "+equacao+" e': "+resultado);



	}
}