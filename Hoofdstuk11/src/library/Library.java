package library;

public class Library {
	
	
	Writer[] writerarray;
	Book[] bookarray;
	
	
	private String name;

	public Library(String name) {
		
		this.name = name;
	}

	public Library() {
		
		this(null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Writer[] getWriterarray() {
		return writerarray;
	}

	public void setWriterarray(Writer[] writerarray) {
		this.writerarray = writerarray;
	}

	public Book[] getBookarray() {
		return bookarray;
	}

	public void setBookarray(Book[] bookarray) {
		this.bookarray = bookarray;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + "]";
	}
		

}
