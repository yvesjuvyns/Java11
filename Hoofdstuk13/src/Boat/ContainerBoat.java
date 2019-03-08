package Boat;

public class ContainerBoat extends Boat {
	
	private int horsePower;
	
	
	public ContainerBoat() {
		
	}
		

	public ContainerBoat(int horsePower) {
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
		System.out.println("I float but my containers don't");

	}

	@Override
	public void Move() {
		System.out.println("Moving stuff around the globe");

	}

}
