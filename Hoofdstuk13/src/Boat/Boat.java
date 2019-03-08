package Boat;

public abstract class Boat extends Vehicle implements Floatable{
	
	private double weight;
	private double topSpeed;
	private String name;
	private Captain captain;
	
	public Boat() {
		
		this(0,0,null,null);
		
	}
	
	public Boat(double weight, double topSpeed, String name, Captain captain) {
		
		this.weight = weight;
		this.topSpeed = topSpeed;
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Captain getCaptain() {
		return captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}
		
	

}
