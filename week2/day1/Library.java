package week2.day1;

public class Library {
	// method to display book added with arg
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}

	// method to displayed book issued without arg
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	// main method
	public static void main(String[] args) {
		// object creation
		Library library = new Library();

		System.out.println(library.addBook("Book Title"));
		library.issueBook();
	}
}