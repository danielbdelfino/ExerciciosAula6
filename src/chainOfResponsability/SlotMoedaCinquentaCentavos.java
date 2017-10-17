package chainOfResponsability;

public class SlotMoedaCinquentaCentavos implements SlotMoeda {
	private double	cinquentaCentavos	= 0.50;

	@Override
	public double insereMoeda(double valorMoeda) {
		return cinquentaCentavos == valorMoeda ? valorMoeda : 0;
	}

}
