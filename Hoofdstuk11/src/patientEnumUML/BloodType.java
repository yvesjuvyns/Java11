package patientEnumUML;

public enum BloodType {
	
	A(),B(),AB(),O(),UNKNOWN();
	
	private String value;
	

	private BloodType(String value) {
		this.value = value;
	}
	
	private BloodType() {
		this(null);
	}
	
	public String getValue () {
		return value;
	}
	
	
	
}
