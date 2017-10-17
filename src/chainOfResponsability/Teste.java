package chainOfResponsability;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Maquina maquina = new Maquina();
		
		maquina.insereMoeda(0.01);
		maquina.insereMoeda(0.10);
		maquina.insereMoeda(0.50);
		maquina.insereMoeda(0.50);
		
		System.out.println(maquina.retirarProduto(Produto.REFRIGERANTE));
		
		maquina.insereMoeda(0.50);
		maquina.insereMoeda(0.50);
		maquina.insereMoeda(0.50);

		System.out.println(maquina.retirarProduto(Produto.REFRIGERANTE));
	}

}
