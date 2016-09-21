// Test class for Loan entity

package library.entities;

import java.util.Date;


// Test class loan starts

public class LoanTest {

	// Start of main function
	
	public static void main(String[] args)
	
	{
	
		// Create object book1 of Book class
	
		Book book1= new Book("Manpreet", " ABC","2343",444);
		
		// Create object borrower1 of Member class
		
		Member borrower1 = new Member("Japgun", "Walia", "045231854", "japgunwalia.2014@gmail.com", 1214);
		
		int year = 2016;
		int month = 10;
		int date = 02;
		Date borrowDate = new Date(year,month,date);
		Date dueDate = new Date(2016, 05, 06);
		
		// Loan L= new Loan(book1, borrower1, borrowDate, dueDate);
	
		// Test the getFirstName()	function
	
		System.out.println("First Name of Borrower is: " + borrower1.getFirstName());
	
	// test the getLastNAme() function

		System.out.println("Last Name of Borrower is:" + borrower1.getLastName());
	
	//Test the getContactPhone() Function
	
		System.out.println("The COntact Number of borrower is:" + borrower1.getContactPhone());
	
	
	// Test the getEmailAddress() function
	System.out.println("The E-mail address of borrower is:" + borrower1.getEmailAddress());

	// Test the getID() function
	
	System.out.println("The ID of borrower is:" + borrower1.getID());
	
	// Test the toString() function
	
	//System.out.println("The detail of loan is:" + borrower1.toString());
	
	// Test the getState()  function 
	System.out.println("The state of borrower is:" + borrower1.getState());
	
	// Test the getFineAmount function
	System.out.println("The fine of borrower is:" + borrower1.getFineAmount());
	
	// Test the hasReacehdLoanLimit() function
	System.out.println("Is borrower reached to the loan limit:" + borrower1.hasReachedLoanLimit());
	
	// Test the hasFinePAyable() function
	System.out.println("Has the borrower fine payable:" + borrower1.hasFinesPayable());
	
	// Test the hasReachedFineLimit() function
	System.out.println("IS borrower reached to the fine limit:" + borrower1.hasReachedFineLimit());
	
	// Test the getFineAmount() function
	System.out.println("The fine amount of borrower is:" + borrower1.getFineAmount());
	
	//
	
	}	
	// End of Main Function
	
}
// End of Test class loan