package ThrowingApp;

public class TennisBall extends Ball {

	public void bounce() {
		System.out.println("TennisBall will bounce");
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("TennisBall is launched");
	}

}
