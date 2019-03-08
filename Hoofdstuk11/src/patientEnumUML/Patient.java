package patientEnumUML;

public class Patient extends Person {
	
	
	BloodType bloodtype;

	public Patient(String name, int age, double weight, Gender gender, BloodType bloodtype) {
		super(name, age, weight, gender);
		this.bloodtype = bloodtype;
	}

	public Patient() {
		
		this(null, 0, 0, null, null);
	}

	public BloodType getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(BloodType bloodtype) {
		this.bloodtype = bloodtype;
	}

	@Override
	public String toString() {
		return "Patient [bloodtype=" + bloodtype + ", toString()=" + super.toString() + "]";
	}
	
	
}
