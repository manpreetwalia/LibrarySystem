package library.daos;

import java.util.Calendar;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.Console;

import library.entities.Book;
import library.entities.Member;
//import library.interfaces.entities.IBook;
//import library.interfaces.entities.ILoan;
//import library.interfaces.entities.IMember;

public class LoanHelperTest {
	public static void main(String[] args){
		//create objects for book and member classes
		Book book2 = new Book("Gurwinder Singh", "Database Management System", "+919876512345", 1);
		Member borrower2 = new Member("Gagan", "Saini", "047894467", "gagansaini@gmail.com", 111);
		
		//int year = 2016;
		//int month = 10;
		//int date = 15;
		//Date borrowDate = new Date(year,month,date);
		boolean damaged = false;
		
		Date borrowDate = new Date();     //create object borrowDate for Date
		Date dueDate = new Date();	     //create object dueDate for Date
		String Author;      
		String BookTitle;
		int id;
		Scanner in = new Scanner(System.in);
		
		//getting book details
		System.out.println("Book details:");
		System.out.println("");
		System.out.println("The author name is " + book2.getAuthor());      //get author name from book class
		System.out.println("The callNumber is: " + book2.getCallNumber());      //get author call number from book class
		System.out.println("ID: " + book2.getID());               //get book id from book class
		System.out.println("Book title: " + book2.getTitle());		      //get book title from book class
		System.out.println("Loan is " + book2.getLoan());           //get loan from book class
		System.out.println("Book is " + book2.getState());            //checking book availability
		System.out.println("");
		System.out.println("");
		
		//getting borrower details
		System.out.println("Borrower details:");
		System.out.println("");
		System.out.println("Contact Number: " + borrower2.getContactPhone());      //getting borrower contact number from member class
		System.out.println("Email ID: " + borrower2.getEmailAddress());
		System.out.println("The fine amount is: " + borrower2.getFineAmount());
		System.out.println("First Name: " + borrower2.getFirstName());		
		System.out.println("Last Name: " + borrower2.getLastName());
		System.out.println("ID is: " + borrower2.getID());
		System.out.println("Loan is: " + borrower2.getLoans());
		System.out.println(borrower2.getState()); //Is borrowing allowed.
		System.out.println(damaged);				
		
		
		//Checking book is on loan?
		System.out.println("Enter author name:");
		Author = in.nextLine();
		System.out.println("Enter Title of book");
		 BookTitle = in.nextLine();
		 
		 if(Pattern.matches("[a-zA-Z]+", Author) == false &&  Author !=null && BookTitle != null) {
			 if(Author.equalsIgnoreCase("Mr. JK Rowling") && BookTitle.equalsIgnoreCase("Harry Potters"))
	      {
	    	  System.out.println("The Book is on loan");//Print the output if condition satisfies
	      }
			 else if(Author.equalsIgnoreCase("Mr. JK Rowling") && BookTitle.equalsIgnoreCase("Harry Potter man"))
		      {
		    	  System.out.println("The Book is not on loan");//Print the output if condition satisfies
		      }
		 }		
		
		//Checking overdues
		
		if(borrowDate.compareTo(dueDate)<0)
		{
			System.out.println("Overdue loan!");
		}
		else
		{
			System.out.println("No overdue loan!");			
		}
	  //System.out.println("" + borrower2.getClass());		
	}
}
