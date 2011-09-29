package ca.mrtipper.booklibrary;

import static org.junit.Assert.*;

import org.junit.Test;


public class BookTest {

	@Test
	public void newBookHasDefaultInitialValues() {
		Book b1 = new Book("Book Title");
		assertEquals("Book Title", b1.getTitle());
		assertEquals("", b1.getAuthor());
	}
}
