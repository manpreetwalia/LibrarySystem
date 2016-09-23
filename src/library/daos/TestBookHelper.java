// Start of test class for the BookHElper 

package library.daos;

import library.entities.Book;

// Start of the class TestBookHepler
public class TestBookHelper {

	// Start of the main function

	public static void main(String[] args)

	{

		// Create object book1 of class IBook, MakeBook

		Book b1 = new Book("Japgun", "Database", "98765432", 6666);
		Book Bk = new Book("Preet", "Networking", "123456", 4562);

		// Test the function getAuthor()

		System.out.println("The Name of author is:    " + b1.getAuthor());
		System.out.println("The Name of author is:    " + Bk.getAuthor());

		// Test the function getTitle()

		System.out.println("The title of book is:    " + b1.getTitle());
		System.out.println("The title of book is:    " + Bk.getTitle());

		// Test the function getCallNumber()

		System.out.println("The callNumber of book is:   " + b1.getCallNumber());
		System.out.println("The callNumber of book is:   " + Bk.getCallNumber());

		// Test the function getID()
		System.out.println("The ID of book is:    " + b1.getID());
		System.out.println("The ID of book is:    " + Bk.getID());

		// Test the function toString()
		System.out.println("Details of b1 are    " + b1.toString());
		System.out.println("Details of b1 are    " + Bk.toString());

		// Test the function getState()
		System.out.println("The state of book is:     " + b1.getState());
		System.out.println("The state of book is:     " + Bk.getState());

		// Test the function getLoan()
		System.out.println("The loan of book is:   " + b1.getLoan());
		System.out.println("The loan of book is:   " + Bk.getLoan());

	}

}
