
// Start of Test class for Book entity
package library.entities;

// Start of class TestBook class
public class TestBook {

	// Start of main function
	public static void main(String[] args) {

		// Create object b1 of class book

		Book b1 = new Book("Manpreet Walia", " Introductio to JAVA", "158643", 456);

		// Test the function getAuthor()

		System.out.println("The Name of author is:    " + b1.getAuthor());

		// Test the function getTitle()

		System.out.println("The title of book is:    " + b1.getTitle());

		// Test the function getCallNumber()

		System.out.println("The callNumber of book is:   " + b1.getCallNumber());

		// Test the function getID()

		System.out.println("The ID of book is:    " + b1.getID());

		// Test the function toString()

		System.out.println("Details of b1 are    " + b1.toString());

		// Test the function getState()

		System.out.println("The state of book is:     " + b1.getState());

		// Test the function getLoan()

		System.out.println("The loan of book is:   " + b1.getLoan());

	}
}
