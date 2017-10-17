package chainOfResponsability;

public class SlotMoedaUmCentavo implements SlotMoeda {
	private double	umCentavo	= 0.01;

	@Override
	public double insereMoeda(double valorMoeda) {
		return umCentavo == valorMoeda ? valorMoeda : 0;
	}
}
