package Boat;

public enum BrandType {

	AUDI(1800), PORSCHE(1200), TESLA(3000);
	
	int weight;
		

	private BrandType(int weight) {
		this.weight = weight;
	}
	
	
	
}
