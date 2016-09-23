package library.daos;

import library.entities.Book;
import library.entities.Member;
import java.util.Date;
//import java.util.Calendar;

public class LoanMapDAOTestG {
	
		public static void main(String[] args){
			
			//creating objects for LoanHelper and Date
			LoanHelper hlpr = new LoanHelper();			
			Date borrowDate = new Date();
			Date dueDate = new Date();
						
			//Date dt = new Date();
			//Creating objects for classess Book, Member and LoanMapDAO
			Book book2 = new Book("Gaganjot", "Java", "123456789", 1111);
			Member borrower2 = new Member("Gaganjot", "Saini", "123456789", "gagansaini@gmail.com", 111);			
			LoanMapDAO lmd = new LoanMapDAO(hlpr);			
						
			System.out.println(book2.getLoan());   
			System.out.println("" + hlpr.getClass());
			System.out.println(lmd.getLoanByID(1));       //get loan by ID
			System.out.println("" + lmd.getLoanByBook(book2));       //get loan by book details
			System.out.println(hlpr.makeLoan(book2, borrower2, borrowDate, dueDate));	      //creating loan
			 
			//get LoanByBookDetails
			System.out.println("Loan on this book is: " + book2.toString());
			
			//get LoanByBorrowerId
			System.out.println("This StudentId has loans: " + borrower2.getID());
			
			//Find loan by borrower details
			System.out.println("This member has following loans: " + borrower2.toString()+ book2.toString());
	}
		
}