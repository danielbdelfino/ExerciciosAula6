package strategy;


public class Amostrador {
	private int[]	populacao;

	public Amostrador(int[] codigosZip) {
		populacao = codigosZip;
	}

	public int[] selecionaSubconjunto(int tamanhoAmostra, String metodo) {
		if (metodo.equals("randomico")) {
			SubconjuntoRandomico subRandomico = new SubconjuntoRandomico();

			return subRandomico.selecionaSubconjunto(tamanhoAmostra, metodo, populacao);
		} else if (metodo.equals("sistematico")) {
			SubconjuntoSistematico subSistematico = new SubconjuntoSistematico();
			
			return subSistematico.selecionaSubconjunto(tamanhoAmostra, metodo, populacao);
		}
		return null;
	}

	public int[] getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int[] populacao) {
		this.populacao = populacao;
	}

}
