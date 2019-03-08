
public class DayApp {
	public static void main(String[] args) {


		Day[] listOfDays;

		for (Day d : Day.values()) {

			System.out.println(d.name());
			System.out.println(d.ordinal());
			System.out.println(d.isWeekday());
			System.out.println("toString :: " + d);
		}

	}

}
