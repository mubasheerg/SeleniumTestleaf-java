package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		//object creation
		Library library1 = new Library();

		System.out.println(library1.addBook("Book Title1"));
		library1.issueBook();
	}
}