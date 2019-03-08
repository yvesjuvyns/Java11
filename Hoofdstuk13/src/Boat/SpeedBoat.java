package Boat;

public class SpeedBoat extends Boat {

	private int horsePower;
	
	
	public SpeedBoat() {
		
		this(0);
	}
		
	public SpeedBoat(int horsePower) {
		super();
		this.horsePower = horsePower;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public void Float() {
		System.out.println("I am shredding the sea");

	}

	@Override
	public void Move() {
		System.out.println("Moving fast across the seas");
		
	}

}
