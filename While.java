import br.edu.uniopet.Reader;

public class AulaWhile {

	public static void main(String[] args)

	{

		double soma = 0;
		int quantidadeAlunos = Reader.readIntNotNull("Entre com a quantidade de alunos: ").intValue();
		int i = 0;

		while (i < quantidadeAlunos) {

			double notaAluno = 0;

			notaAluno = Reader.readDoubleNotNull("Entre com a nota do aluno:").doubleValue();
			soma = notaAluno + soma;

			i++;

		}

		double media = soma / quantidadeAlunos;
		System.out.println("media: " + media);
	}

}
