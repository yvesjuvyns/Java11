package ThrowingApp;

public class BasketBall extends Ball {

	public void bounce() {
		System.out.println("Rocket will bounce");
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("Rocket is launched");
	}	
	
}
