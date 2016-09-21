 // Start of test class BookMapDAO

package library.daos;

import java.io.Console;
import java.util.Scanner;

import library.entities.Book;

// Start of TestBookMapDAO class

public class BookMapDAOTest
{

// Start of main function
	
	public static void main(String[] args)
	{
		String Author = null;  // Initializing string Author
		String Title = null;//  Initializing the title
		
		Scanner in = new Scanner(System.in);  //Taking the input as Author
		 
	      System.out.println("Enter Author name");//Inputs for Author name
	      Author = in.nextLine();// Accesing input Author Name
	     
	 
	      System.out.println("Enter Title of book");//Inputs for Title 
	      Title = in.nextLine();//accessing input title
	      
	      if(Author== "JK Rowling" && Title=="Harry Potter")
	      {
	    	  System.out.println("Book edition is : Chamber of Secrets");
	      }
	     

	}
}
