package AdapterPattern;

public class MovableAdapterImpl implements MovableAdapter{
	
	private Movable luxuryCars;
	
//	standard constructors
	
	public MovableAdapterImpl(Movable bugattiVeyron) {
		this.luxuryCars = bugattiVeyron;
	}

	@Override
	public double getSpeed() {
		
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	
	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
	
	@Override
	public double getPrice() {
		
		return convertUSDtoEuro(luxuryCars.getPrice());
		
	}

	private double convertUSDtoEuro(double usd) {
		
		return usd * 0.86;
	}
}
