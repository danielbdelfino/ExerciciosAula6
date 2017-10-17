package strategy;

import java.util.ArrayList;
import java.util.Random;

public class SubconjuntoRandomico implements Subconjunto {

	@Override
	public int[] selecionaSubconjunto(int tamanhoAmostra, String metodo, int[] populacao) {
		int[] subConjunto = new int[tamanhoAmostra];
		Random generator = new Random();

		// faz uma cópia usando ArrayList
		// fica fácil amostrar sem repetir
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		for (int i = 0; i < populacao.length; i++) {
			tempArray.add(populacao[i]);
		}

		for (int i = 0; i < tamanhoAmostra; i++) {
			subConjunto[i] = tempArray.remove(generator.nextInt(tempArray.size()));
		}
		
		return subConjunto;
	}

}
