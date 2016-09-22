package library.daos;

import library.entities.Book;
import library.entities.Member;
import java.util.Date;
//import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

//Start of main function
public class LoanMapDAOTest {
	
		public static void main(String[] args){
			
			Scanner in = new Scanner(System.in);
			//int id;
			String commitLoan;
			//final Object String findLoansByBookTitle;
			
			//LoanHelper hlpr = new LoanHelper();			
			//Date borrowDate = new Date();
			//Date dueDate = new Date();
						
			//Date dt = new Date();
			Book book2 = new Book("Gagan", "Java", "123456789", 1111);
			Member borrower2 = new Member("Gagan", "Saini", "123456789", "gagansaini@gmail.com", 111);
			//LoanMapDAO lmd = new LoanMapDAO(hlpr);			
			String findLoansByBookTitle = book2.getTitle();
					//System.out.println("Commit Loan");
			//commitLoan = in.nextLine();
			
			//public class OddEvenTest {

			    //@Test
			    //public void testEvenNum() {
			      //  boolean ans = true;
			       // boolean val;
			       // double num = 6;
			      //  OddEven oddEven = new OddEven();

			      //  val = oddEven.evenNum(num);
			       // assertEquals(ans,val);			
			
			if(book2.getTitle().equalsIgnoreCase(findLoansByBookTitle))
			{
				System.out.println("This book is on loan.");
				//return true;
			}
			else
			{
				System.out.println("Book is not on loan.");			
				
			}	
			/*
			public String toString()
			{
			    String total = "\n ";
			    for (int i=0; i<collection.size(); i++)
			    {
			        Book b = collection.get(i);
			        total = total + b.toString();
			    }

			    return total;
			} */
			
			//System.out.println(book2.getLoan());
			//System.out.println("" + hlpr.getClass());
			//System.out.println(lmd.getLoanByID(1));
			//System.out.println(hlpr.makeLoan(book2, borrower2, borrowDate, dueDate));		
		}
}
