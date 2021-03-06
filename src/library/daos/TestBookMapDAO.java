// Start of test class BookMapDAO

package library.daos;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;
// import entity  Book from lobrary
import library.entities.Book;

// Start of TestBookMapDAO class

public class TestBookMapDAO {

	// Start of main function

	public static void main(String[] args) {
		String Author; // Initializing string Author
		String Title;// Initializing the title
		int ID; // Initializing the iD of book
		Scanner in = new Scanner(System.in); // Taking the input as Author

		System.out.println("Enter the Author name"); // Inputs for Author name
		Author = in.nextLine();// Accept the input as Author Name

		System.out.println("Enter the Title of book"); // Inputs for Title
		Title = in.nextLine(); // accept the input as title of book

		if (Pattern.matches("[a-zA-Z]+", Author) == false && Author != null && Title != null // checks
																								// the
																								// condition
		) {

			if (Author.equalsIgnoreCase("Y. Liang") && Title.equalsIgnoreCase("Introduction to java")) {

				System.out.println("Book edition is : Increased data structure chapters 8th edition");// Print
																										// the
																										// output
																										// if
																										// condition
																										// satisfies
			}

			else if (Author.equalsIgnoreCase("Peter Revesz") && Title.equalsIgnoreCase("Introduction to database")) {
				System.out.println("Book edition is : Programming Knowledge");// Print
																				// the
																				// output
																				// if
																				// condition
																				// satisfies
			}

			else if (Author.equalsIgnoreCase("Daniel T. Larose")
					&& Title.equalsIgnoreCase("Introduction to data minig")) {
				System.out.println("Book edition is : Big Data");// Print the
																	// output if
																	// condition
																	// satisfies
			}

			else if (Author.equalsIgnoreCase("A. Forouzan") && Title.equalsIgnoreCase("Data Communication")) {
				System.out.println("Book edition is : Introduction to communication $ data");// Print
																								// the
																								// output
																								// if
																								// condition
																								// satisfies
			}

			else if (Author.equalsIgnoreCase("Christina Faulkner")
					&& Title.equalsIgnoreCase("Introduction to networking")) {
				System.out.println("Book edition is : Basics of networking");// Print
																				// the
																				// output
																				// if
																				// condition
																				// satisfies
			} else if (Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter6")) {
				System.out.println("Book edition is : Half Blood Prince");// Print
																			// the
																			// output
																			// if
																			// condition
																			// satisfies
			} else if (Author.equalsIgnoreCase("JK Rowling") && Title.equalsIgnoreCase("Harry Potter7")) {
				System.out.println("Book edition is : Deathly Hallows");// Print
																		// the
																		// output
																		// if
																		// condition
																		// satisfies
			}

			else {
				System.out.println("Either of the values do not match our records.Pls enter correct values!");// print
																												// a
																												// msg
																												// on
																												// screen
			}
		} else {
			System.out.println("You enter the wrong value. Pls enter valid charecters");// if
																						// the
																						// conditions
																						// dosent
																						// satisfy
																						// then
																						// this
																						// statement
																						// is
																						// executed
		}

		{
		}
	}
}
