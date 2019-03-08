package ThrowingApp;

public abstract class Ball implements Launchable {

	private String brandName;	
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public abstract void bounce();
		
		
}
