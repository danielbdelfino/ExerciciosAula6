package strategy2;

public class ProcessadorMensagemDia {
	public String getMensagemDia(String dia) {
		String mensagem = "";

		dia = dia == null ? "" : dia;
		
		switch (dia) {
			case Semana.DOMINGO:
				mensagem = new Domingo().mensagemDoDia();

				break;
			case Semana.SEGUNDA:
				mensagem = new SegundaFeira().mensagemDoDia();

				break;
			case Semana.TERCA:
				mensagem = new TercaFeira().mensagemDoDia();

				break;
			case Semana.QUARTA:
				mensagem = new QuartaFeira().mensagemDoDia();

				break;
			case Semana.QUINTA:
				mensagem = new QuintaFeira().mensagemDoDia();

				break;
			case Semana.SEXTA:
				mensagem = new SextaFeira().mensagemDoDia();

				break;
			case Semana.SABADO:
				mensagem = new Sabado().mensagemDoDia();

				break;

			default:
				mensagem = "Dia da semana não encontrado";
				break;
		}

		return mensagem;
	}
}
