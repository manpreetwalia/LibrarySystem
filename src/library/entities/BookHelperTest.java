// Start of test class for the BookHElper 

package library.daos;

import library.entities.Book;

// Start of the class TestBookHepler
public class BookHelperTest {
	
// Start of the main function
	
	public static void main(String[] args)
	{
		
// Create object book1 of class IBook, makebook
		Book b1 = new Book("Japgun", "Database", "98765432", 6666);
		Book bk1 = new Book("Preet", "Computer Graphics", "945632", 4567);
		// Test the function getAuthor()
				System.out.println("The Name of author is:    " + b1.getAuthor()); // display the out
				System.out.println("The Name of author is:    " + bk1.getAuthor()); // display the out
				
		// Test the function getTitle()
				
				System.out.println("The title of book is:    " + b1.getTitle()); // display the out
				System.out.println("The title of book is:    " + bk1.getTitle()); // display the out
				
		// Test the function getCallNumber()
				
				System.out.println("The callNumber of book is:   " + b1.getCallNumber()); // display the out
					System.out.println("The callNumber of book is:   " + bk1.getCallNumber()); // display the out
				
		// Test the function getID()
				System.out.println("The ID of book is:    " + b1.getID()); // display the out
				System.out.println("The ID of book is:    " + bk1.getID()); // display the out
				
		// Test the function toString()
				System.out.println("Details of b1 are    " + b1.toString()); // display the out
					System.out.println("Details of b1 are    " + bk1.toString()); // display the out
				
		// Test the function getState()		
				System.out.println("The state of book is:     " + b1.getState()); // display the out
					System.out.println("The state of book is:     " + bk1.getState()); // display the out
				
		// Test the function getLoan()
				System.out.println("The loan of book is:   " + b1.getLoan()); // display the out
					System.out.println("The loan of book is:   " + bk1.getLoan()); // display the out

			}
		

}
