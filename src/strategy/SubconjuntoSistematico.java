package strategy;

import java.util.Arrays;
import java.util.Random;

public class SubconjuntoSistematico implements Subconjunto{

	@Override
	public int[] selecionaSubconjunto(int tamanhoAmostra, String metodo, int[] populacao) {
		int[] subConjunto = new int[tamanhoAmostra];
		Random generator = new Random();

		// faz cópia da população.
		// não queremos causar efeitos colaterais.
		int[] populacaoOrdenada = new int[populacao.length];
		System.arraycopy(populacao, 0, populacaoOrdenada, 0, populacao.length);
		Arrays.sort(populacaoOrdenada);

		int step = populacaoOrdenada.length / tamanhoAmostra;
		int startingPoint = generator.nextInt(step);

		// seleciona elementos em intervalo regular ‘step’
		for (int i = 0; i < tamanhoAmostra; i++) {
			subConjunto[i] = populacaoOrdenada[startingPoint + (i * step)];
		}

		return subConjunto;
	}

}
