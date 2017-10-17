package chainOfResponsability;

public class SlotMoedaDezCentavos implements SlotMoeda {
	private double	dezCentavos	= 0.10;

	@Override
	public double insereMoeda(double valorMoeda) {
		return dezCentavos == valorMoeda ? valorMoeda : 0;
	}

}
