package strategy;

public class Cliente {
	public static void main(String args[]) {

		// Populacao
		int[] zipCodes = new int[] { 66209, 64113, 10162, 90210, 61701, 55901, 48823, 62901, 50014 };

		Amostrador amostrador = new Amostrador(zipCodes);
		int[] amostra = amostrador.selecionaSubconjunto(3, "randomico");

		// imprime a amostra
		for (int i = 0; i < amostra.length; i++) {
			System.out.println(amostra[i]);
		}

		System.out.println();

		// Cria outra amostra usando um algoritmo diferente
		amostra = amostrador.selecionaSubconjunto(3, "sistematico");

		for (int i = 0; i < amostra.length; i++) {
			System.out.println(amostra[i]);
		}
	}
}
