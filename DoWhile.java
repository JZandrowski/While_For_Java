import br.edu.uniopet.Reader;

public class AulaDoWhile {
	
	public static void main(String[] args)
	{

		int anoAtual;
		
		do {
			
			anoAtual = Reader.readIntNotNull("Digite o ano atual:").intValue();
			
		} while(anoAtual != 2019);
			
		
	}
	
}
