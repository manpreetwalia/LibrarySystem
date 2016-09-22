package library.daos;

import library.entities.Book;
import library.entities.Member;
import java.util.Date;
//import java.util.Calendar;

public class LoanMapDAOTestG {
	
		public static void main(String[] args){
			
			LoanHelper hlpr = new LoanHelper();			
			Date borrowDate = new Date();
			Date dueDate = new Date();
						
			//Date dt = new Date();
			Book book2 = new Book("Gaganjot", "Java", "123456789", 1111);
			Member borrower2 = new Member("Gaganjot", "Saini", "123456789", "gagansaini@gmail.com", 111);
			
			//LoanMapDAO lmd = new LoanMapDAO(hlpr);			
						
			//System.out.println(book2.getLoan());
			//System.out.println("" + hlpr.getClass());
			//System.out.println(lmd.getLoanByID(1));
			//System.out.println("" + lmd.getLoanByBook(book2));
			//System.out.println(hlpr.makeLoan(book2, borrower2, borrowDate, dueDate));	
			
			//get LoanByBook
			System.out.println("Loan on this book is: " + book2.toString());
			//get LoanById
			System.out.println("This StudentId has loans: " + borrower2.getID());
	}
		
}