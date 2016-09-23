// Start of test class BookMapDAO

package library.daos;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;

import library.entities.Book;

// Start of TestBookMapDAO class

public class BookMapDAOTest {

	// Start of main function

	public static void main(String[] args) {
		String Author; // Initializing string Author
		String Title;// Initializing the title
		int ID; // Initializing Integer ID

		Scanner in = new Scanner(System.in); // Taking the input as Author

		System.out.println("Enter the Author name"); // Inputs for Author name
		Author = in.nextLine();// Accept the input as Author Name

		System.out.println("Enter the Title of book"); // Inputs for Title
		Title = in.nextLine(); // accept the input as title of book

		System.out.println("Enter the id of book"); // Enter the id of book
		ID = in.nextInt(); // Accept the ID of as input

		if (Pattern.matches("[a-zA-Z]+", Author) == false && Author != null && Title != null)

		{
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
			} else if (Author.equalsIgnoreCase("R. Kapuno") && Title.equalsIgnoreCase("C/C++")) {
				System.out.println("Book edition is : Basics of programming");// Print
																				// the
																				// output
																				// if
																				// condition
																				// satisfies
			} else if (Author.equalsIgnoreCase("Rajiv Malhotra ")
					&& Title.equalsIgnoreCase("Introduction to dot net")) {
				System.out.println("Book edition is : Basics of .net");// Print
																		// the
																		// output
																		// if
																		// condition
																		// satisfies
			}

			else {
				System.out.println("Either of the values do not match our records.Pls enter correct values!");
			}

		} else {
			System.out.println("Pls enter valid charecters");// if the
																// conditions
																// dosen't
																// satisfy then
																// this
																// statement is
																// executed
		}

		if (Author.equalsIgnoreCase("Y. Liang") && ID == 123)
			; // gives output if both condition are true
		System.out.println(" The author of book is : Y. Liang"); // display the
																	// author
																	// name

		if (Author.equalsIgnoreCase("Rajiv Malhotra") && ID == 321)
			; // gives output if both condition are true
		System.out.println(" The author of book is : Rajiv Malhotra"); // display
																		// the
																		// author
																		// name

	}
}
