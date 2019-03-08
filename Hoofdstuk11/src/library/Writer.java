package library;

public class Writer {
	
	private String name;

	public Writer(String name) {
		super();
		this.name = name;
	}

	public Writer() {
		
		this(null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Writer [name=" + name + "]";
	}

	

}
