package ca.mrtipper.booklibrary;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book b1 = new Book("Dune");
		System.out.println("Book Tile: " + b1.getTitle());
		System.out.println("Book Author: " + b1.getAuthor());
	}

}
