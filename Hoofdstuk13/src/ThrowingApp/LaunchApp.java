package ThrowingApp;

public class LaunchApp {

	public static void main(String[] args) {
		
		
		Launchable basketBalll = new BasketBall();
		Launchable rockl = new Rock();
		Launchable rocket1 = new Rocket();
		Launchable footBalll = new FootBall();
		Launchable tennisBalll = new TennisBall();
		Launchable[] launchables = { basketBalll,rockl,rocket1,footBalll,tennisBalll};
		
		for(Launchable l : launchables) {
			l.launch();
			
		}
		
		Ball basketBall2 = new BasketBall();
		Ball footBall2 = new FootBall();
		Ball tennisBall2 = new TennisBall();
		Ball[] balls = { basketBall2,footBall2,tennisBall2};
		
		for(Ball b : balls) {
			b.bounce();
			
		}
		
	}

}
