package chainOfResponsability;

public class Maquina {
	private ProcessadorMoedas	processadorMoedas;

	private double				valorRegrigerante	= 2.50;
	private double				valorChips			= 1.0;
	private double				valorBala			= 0.50;

	public Maquina() {
		processadorMoedas = new ProcessadorMoedas();
	}

	public void insereMoeda(double valorMoeda) {
		processadorMoedas.processaMoeda(valorMoeda);
	}

	public String retirarProduto(String produto) {
		String produtoTroco = "VALOR INSUFICIENTE, FAVOR INSERIR MAIS MOEDAS";

		switch (produto) {
			case Produto.REFRIGERANTE:
				if (podeRetirarRefrigerante()) {
					produtoTroco = produto + " - Troco: R$" + processadorMoedas.getTroco(valorRegrigerante);
				} else {

				}

				break;
			case Produto.CHIPS:
				if (podeRetirarChips()) {
					produtoTroco = produto + " - Troco: R$" + processadorMoedas.getTroco(valorChips);
				}

				break;
			case Produto.BALA:
				if (podeRetirarBala()) {
					produtoTroco = produto + " - Troco: R$" + processadorMoedas.getTroco(valorBala);
				}

				break;
		}

		return produtoTroco;
	}

	private boolean podeRetirarChips() {
		return processadorMoedas.getValorTotal() >= valorChips;
	}

	private boolean podeRetirarRefrigerante() {
		return processadorMoedas.getValorTotal() >= valorRegrigerante;
	}

	private boolean podeRetirarBala() {
		return processadorMoedas.getValorTotal() >= valorBala;
	}
}
