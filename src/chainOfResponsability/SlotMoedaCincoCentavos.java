package chainOfResponsability;

public class SlotMoedaCincoCentavos implements SlotMoeda {
	private double	cincoCentavos	= 0.05;

	@Override
	public double insereMoeda(double valorMoeda) {
		return cincoCentavos == valorMoeda ? valorMoeda : 0;
	}

}
