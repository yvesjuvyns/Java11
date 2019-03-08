package Boat;

public class FisherBoat extends Boat {
	
	private double netSize;
	
	public FisherBoat() {
		
		this(0);
	}

	public FisherBoat(double netSize) {
		super();
		this.netSize = netSize;
	}

	public double getNetSize() {
		return netSize;
	}

	public void setNetSize(double netSize) {
		this.netSize = netSize;
	}

	@Override
	public void Float() {
		
		System.out.println("I am bringing the fish in your Fish and chips");

	}

	@Override
	public void Move() {
		System.out.println("Slow but steady");
		
	}

}
