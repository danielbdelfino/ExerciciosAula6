package strategy2;

public class ProcessadorMensagemDia {
	public String getMensagemDia(String dia) {
		String mensagem = "";

		dia = dia == null ? "" : dia;
		
		switch (dia) {
			case Semana.DOMINGO:
				mensagem = getMensagem(new Domingo());

				break;
			case Semana.SEGUNDA:
				mensagem = getMensagem(new SegundaFeira());

				break;
			case Semana.TERCA:
				mensagem = getMensagem(new TercaFeira());

				break;
			case Semana.QUARTA:
				mensagem = getMensagem(new QuartaFeira());

				break;
			case Semana.QUINTA:
				mensagem = getMensagem(new QuintaFeira());

				break;
			case Semana.SEXTA:
				mensagem = getMensagem(new SextaFeira());

				break;
			case Semana.SABADO:
				mensagem = getMensagem(new Sabado());

				break;

			default:
				mensagem = "Dia da semana não encontrado";
				break;
		}

		return mensagem;
	}
	
	private String getMensagem(SemanaStrategy semanaStrategy) {
		return semanaStrategy.mensagemDoDia();
	}
}
