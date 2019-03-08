package Boat;

public class HarborApp {

	public static void main(String[] args) {
		
		Floatable speedboat1 = new SpeedBoat();
		Floatable sailboat2 = new SailBoat();
		Floatable fisherboat3 = new FisherBoat();
		Floatable containerboat4 = new ContainerBoat();
		Floatable carboat5 = new CarBoat();
	
		CarBoat carBoat1 = new CarBoat();
		ContainerBoat containerBoat1 = new ContainerBoat();
			
		carBoat1.setName("Highway of the sea");
		carBoat1.setWeight(76500);
		carBoat1.setCaptain(new Captain("Haddock",54));
		carBoat1.setTopSpeed(23);
		carBoat1.setCapacity(3000);
		
		containerBoat1.setName("Ocean jenga");
		containerBoat1.setWeight(120000);
		containerBoat1.setTopSpeed(12);
		containerBoat1.setCaptain(new Captain("Kirk",42));
		
		System.out.println(carBoat1.getName());
		System.out.println(carBoat1.getCaptain().getName());
		System.out.println(containerBoat1.getName());
		System.out.println(containerBoat1.getCaptain().getName());
		
		
		Floatable[] floatables = {speedboat1, sailboat2, fisherboat3, containerboat4, carboat5};
		System.out.println("Floatable");
		System.out.println("__________\n");
		for(Floatable f: floatables) {
			f.Move();
			f.Float();
		}	

		Car auto1 = new Car(BrandType.AUDI,200,200,FuelType.DIESEL,60);
		Car auto2 = new Car(BrandType.AUDI,120,170,FuelType.DIESEL,40);
		Car auto3 = new Car(BrandType.TESLA,420,240,FuelType.ELECTRIC,100);
		Car auto4 = new Car(BrandType.PORSCHE,220,210,FuelType.PETROL,60);
		Car[] cars = {auto1,auto2,auto3,auto4};
		System.out.println("cars");
		System.out.println("____\n");
		for(Car c: cars) {
			c.Move();
			c.Drive();
		}
			
		auto1.setBrand(BrandType.AUDI);
		auto1.setFuel(FuelType.DIESEL);
		auto1.setHorsePower(200);
		auto1.setMaxSpeed(200);;
		auto1.setMaxFuel(60);
		
		System.out.println(auto1.getBrand());
		System.out.println(auto1.getFuel());
		System.out.println(auto1.getHorsePower());
		System.out.println(auto1.getMaxSpeed());
		System.out.println(auto1.getMaxFuel());
		
		auto1.Drive();
		auto1.Move();
		
	}

}
