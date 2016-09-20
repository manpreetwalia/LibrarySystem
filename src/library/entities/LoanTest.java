package library.entities;

import java.util.Date;



public class LoanTest {
	public static void main(String[] args){
	
		Book book1= new Book("Manpreet", " ABC","2343",444);
		Member borrower1 = new Member("Preet", "Walia", "045231654", "manpreetwalia.2008@rediffmail.com", 2222);
		
		int year = 2016;
		int month = 10;
		int date = 02;
		Date borrowDate = new Date(year,month,date);
		Date dueDate = new Date(2016, 05, 06);
		//Loan L= new Loan(book1, borrower1, borrowDate, dueDate);
		
	System.out.println("" + borrower1.getFirstName());
	System.out.println("" + borrower1.getLastName());
	
	}
	
	
}
