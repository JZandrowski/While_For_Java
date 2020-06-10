import br.edu.uniopet.Reader;

public class AulaPara {

	public static void main(String[] args)

	{

		double soma = 0;
		int alunos = 20;

		for (int i = 0; i < alunos; i++) {

			double notaAluno = 0;

			notaAluno = Reader.readDoubleNotNull("Entre com a nota do aluno:").doubleValue();
			
			soma = notaAluno + soma;

		}

		double media = soma / alunos;
		System.out.println("media: " + media);
	}

}