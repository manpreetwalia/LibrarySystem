// Start of test class for the BookHElper 

package library.daos;

import library.entities.Book;

// Start of the class TestBookHepler
public class BookHelperTest {
	
// Start of the main function
	
	public static void main(String[] args)
	{
		
// Create object book1 of class IBook, makebook
		Book book1 = new Book("Japgun", "Database", "98765432", 6666);
		// Test the function getAuthor()
				System.out.println("The Name of author is:    " + book1.getAuthor());
				
		// Test the function getTitle()
				
				System.out.println("The title of book is:    " + book1.getTitle());
				
		// Test the function getCallNumber()
				
				System.out.println("The callNumber of book is:   " + book1.getCallNumber());
				
		// Test the function getID()
				System.out.println("The ID of book is:    " + book1.getID()); // display output
				
		// Test the function toString()
				System.out.println("Details of b1 are    " + book1.toString());  // display output
				
		// Test the function getState()		
				System.out.println("The state of book is:     " + book1.getState()); // display output
				
		// Test the function getLoan()
				System.out.println("The loan of book is:   " + book1.getLoan()); // display output

		if(Author.equalsIgnoreCase("Y. Liang") && ID==123);
		System.out.println(" The author of book is : Y. Liang");
		
		
		
	}
			
			
			
		

}
