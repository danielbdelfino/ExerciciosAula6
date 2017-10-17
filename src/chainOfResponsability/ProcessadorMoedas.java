package chainOfResponsability;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProcessadorMoedas {
	private double						valorTotal	= 0;
	private SlotMoedaUmCentavo			slotUmCent;
	private SlotMoedaCincoCentavos		slotCincoCents;
	private SlotMoedaDezCentavos		slotDezCents;
	private SlotMoedaCinquentaCentavos	slotCinquentaCents;

	public ProcessadorMoedas() {
		slotUmCent = new SlotMoedaUmCentavo();
		slotCincoCents = new SlotMoedaCincoCentavos();
		slotDezCents = new SlotMoedaDezCentavos();
		slotCinquentaCents = new SlotMoedaCinquentaCentavos();
	}

	public void processaMoeda(double valorMoeda) {
		valorTotal += getValorPorSlot(valorMoeda);
	}

	public double getValorTotal() {
		return valorTotal;
	}
	
	public double getTroco(double valorProduto) {
		return BigDecimal.valueOf(valorTotal - valorProduto).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	private double getValorPorSlot(double valorMoeda) {
		double valor = slotUmCent.insereMoeda(valorMoeda);
		valor += slotCincoCents.insereMoeda(valorMoeda);
		valor += slotDezCents.insereMoeda(valorMoeda);
		valor += slotCinquentaCents.insereMoeda(valorMoeda);

		return valor;
	}
}
