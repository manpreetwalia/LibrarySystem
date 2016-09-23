package library.entities;

 

import java.util.Date;

import java.util.Calendar;

 

public class TestLoan
{

    

     public static void main(String[] args)

     {

           Date borrowDate = new Date();                  

           Date dueDate = new Date();

           Book book1 = new Book("Manpret Walia", "Introduction to Database", "0672189",5691);

           Member borrower1 = new Member("Preet", "Walia", "5646789", "preetwalia02@gmail.com", 444);

           Loan l1 = new Loan(book1, borrower1, borrowDate, dueDate);

                    
// Testing of loan class functions
           System.out.println(l1.getBook());

           System.out.println(l1.toString());        

           System.out.println(l1.getState());        

           System.out.println(l1.isOverDue());       

           System.out.println("" + l1.getID());

               
// Testing of memebre class functions
                     

           System.out.println("" + borrower1.getFirstName());

           System.out.println("" + borrower1.getLastName());

           System.out.println("" + borrower1.getContactPhone());

           System.out.println("" + borrower1.getEmailAddress());

           System.out.println("" + borrower1.getFineAmount());

           System.out.println("" + borrower1.getID());

           System.out.println("" + borrower1.getClass());

           System.out.println("" + borrower1.getLoans());

           System.out.println("" + borrower1.getState());

          
// Testing of Book class
           System.out.println("" + book1.getAuthor());

           System.out.println("" + book1.getCallNumber());

           System.out.println("" + book1.getID());

           System.out.println("" + book1.getTitle());

           System.out.println("" + book1.getClass());

           System.out.println("" + book1.getState());

           System.out.println("" + borrowDate.getDate()); 

}

 

     private static Date addDays(Date borrowDate, int i) 
     {

           // TODO Auto-generated method stub             

           return null;

     }

}

