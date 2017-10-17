package strategy2;

public class Teste {
	public static void main(String[] args) {
		System.out.println("--- IMPRIMINDO MENSAGENS DO DIA ---");
		ProcessadorMensagemDia processadorMsg = new ProcessadorMensagemDia();
		
		System.out.println(processadorMsg.getMensagemDia(Semana.SEGUNDA));
		System.out.println(processadorMsg.getMensagemDia(Semana.TERCA));
		System.out.println(processadorMsg.getMensagemDia(""));
		
		System.out.println("\n\nFIM");
	}
}
