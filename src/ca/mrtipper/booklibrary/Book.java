package ca.mrtipper.booklibrary;

public class Book {

	private String title;
	private String author;

	public Book(String title) {
		this.title = title;
		this.author = "";
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

}
