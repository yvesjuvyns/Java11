package patientEnumUML;

public class PersonApp {

	public static void main(String[] args) {
		
		Patient p = new Patient("Bob", 30, 65, Gender.MAN, BloodType.O);
		
		System.out.println(p);
				
		
	}

}
