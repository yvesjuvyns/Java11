package library;

public class LibraryApp {

	public static void main(String[] args) {
		
		
		Book a = new Book("Jurassic Park", 550, BookCategory.SCIENCEFICTION);
		Book b = new Book("Success", 400, BookCategory.BIOGRAPHY);
		Book c = new Book("WTF?", 200, BookCategory.MYSTERY);
		
		Library library = new Library("Bekorf");
		
		System.out.println(a);

	}

}
