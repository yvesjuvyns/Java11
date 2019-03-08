package Boat;

public class SailBoat extends Boat {
	
	private double sailSize;
	

	public SailBoat() {
		
		this(0);
	}

	public SailBoat(double sailSize) {
		super();
		this.sailSize = sailSize;
	}

	public double getSailSize() {
		return sailSize;
	}

	public void setSailSize(double sailSize) {
		this.sailSize = sailSize;
	}

	@Override
	public void Float() {
		System.out.println("I am sailing, I am sailing, across the sea");

	}

	@Override
	public void Move() {
		System.out.println("Moving when the wind is blowing");
		
	}

}
