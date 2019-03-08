
public enum Day {
	
	
	MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);
	
	private boolean weekday = false;
	

	private Day(boolean weekday) {
		this.weekday = weekday;
	}
		

	public boolean isWeekday () {
		return weekday;
	}
	
	public String toString() {
		return name() + (weekday? "(weekday)" : "(weekday)");
	}
	
	
	
}
