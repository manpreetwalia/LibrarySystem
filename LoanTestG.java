package library.entities;

import java.util.Date;

import java.util.Calendar;

public class LoanTestG {
	//main method start
	public static void main(String[] args) 
	{
		Date borrowDate = new Date();				
		Date dueDate = new Date();	
		int loanId = 1;
		//System.out.println("Today's date: "+ borrowDate.toString());		
		//create objects for Classes Book, Member and Loan		
		Book book1 = new Book("Liang", "Java", "044246789", 11);
		Member borrower1 = new Member("Gagan", "Saini", "0449783587", "gagansaini@gmail.com", 111);
		Loan l1 = new Loan(book1, borrower1, borrowDate, dueDate);
				
		//System.out.println(l1.getBook());
		//System.out.println(l1.toString());		
		//System.out.println(l1.getState());		
		//System.out.println(l1.getID());						
			
		//int year = 2016;
		//int month = 10;
		//int date = 15;		
		//int year = 2016;
		//int month = 10;
		//int date2 = 31;	
		
		//getting borrower details for making loan
		System.out.println("Borrower detail are as follow:");
		System.out.println("");
		System.out.println("Borrower first name: " + borrower1.getFirstName()); //get borrower first name
		System.out.println("Borrower last name: " + borrower1.getLastName()); //get borrower last name
		System.out.println("Borrower contact number: " + borrower1.getContactPhone()); //get borrower contact number
		System.out.println("Borrower EmailID: " + borrower1.getEmailAddress());  //get borrower email address
		System.out.println("Fine amount for this borrower is: " + borrower1.getFineAmount()); 
		System.out.println("Member(Borrower) ID is: " + borrower1.getID());
		//System.out.println("" + borrower1.getClass());
		System.out.println("Loan is: " + borrower1.getLoans());
		System.out.println("Borrowing Allowed to member? :" + borrower1.getState()); //checking that whether member is allowed or borrowing
		System.out.println("");
		
		//getting book details for borrowing
		System.out.println("Book detail are as follow:"); 
		System.out.println("");
		System.out.println("Book author is: " + book1.getAuthor()); //getting bookAuthorName
		System.out.println("Book callNumber is: " + book1.getCallNumber()); //Getting Author call number
		System.out.println("Book ID is: " + book1.getID());     //getting book ID
		System.out.println("Book title is: " + book1.getTitle());  //Getting Book Title
		System.out.println("" + book1.getClass());
		System.out.println("Book available? : " + book1.getState()); //getting availability of book
		System.out.println("");
		
		//getting borrowDate and dueDate for loan
		System.out.println("Important dates to remember to avoid fine:");
		System.out.println("");
		Calendar clndr = Calendar.getInstance();
		Date today = clndr.getTime();
	    System.out.println("Borrowed on: " + today);
	    clndr.add(Calendar.DAY_OF_YEAR, 15);
	    
	    //Checking Overdues for loan
	    System.out.println("Due on: " + clndr.getTime());	
	    System.out.println("");
	    System.out.println("Overdue loan: " + l1.isOverDue());	
		System.out.println("Loan Id: " + loanId); 
}	
	private static Date addDays(Date borrowDate, int i) {
		// TODO Auto-generated method stub		
		return null;
	}
}