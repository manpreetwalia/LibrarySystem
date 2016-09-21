 // Start of test class BookMapDAO

package library.daos;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;

import library.entities.Book;

// Start of TestBookMapDAO class

public class BookMapDAOTest
{

// Start of main function
	
	public static void main(String[] args)
	{
		String Author;  // Initializing string Author
		String Title;//  Initializing the title
		
		Scanner in = new Scanner(System.in);  //Taking the input as Author
		 
	      System.out.println("Enter Author name");//Inputs for Author name
	      Author = in.nextLine();// Accesing input Author Name
	     
	 
	      System.out.println("Enter Title of book");//Inputs for Title 
	      Title = in.nextLine();//accessing input title
	      
	      if(Pattern.matches("[a-zA-Z]+", Author) == true && Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter1"))
	      {
	    	  System.out.println("Book edition is : Socceres stone");//Print the output if condition satisfies
	      }
	      
	      else if(Pattern.matches("[a-zA-Z]+", Author) == true && Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter2"))
	      {
	    	  System.out.println("Book edition is : Chamber of Secrets");//Print the output if condition satisfies
	      }
	      
	      else if(Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter3"))
	      {
	    	  System.out.println("Book edition is : Prisnor of Askaban");//Print the output if condition satisfies
	      }
	      
	      else if(Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter4"))
	      {
	    	  System.out.println("Book edition is : Goblet of Fire");//Print the output if condition satisfies
	      }
	      
	      else if(Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter5"))
	      {
	    	  System.out.println("Book edition is : Order of Phoenix");//Print the output if condition satisfies
	      }
	      else if(Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter6"))
	      {
	    	  System.out.println("Book edition is : Half Blood Prince");//Print the output if condition satisfies
	      }
	      else if(Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter7"))
	      {
	    	  System.out.println("Book edition is : Deathly Hallows");//Print the output if condition satisfies
	      }
	      
	      else
	      {
	    	  System.out.println("Either of the values do not match our records.Pls enter correct values!");
	      }
	      
	     

	}
}
