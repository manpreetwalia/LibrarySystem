package library.entities;

public class BookTestG {
	/** Start of the main method */
	public static void main(String[] args){
		Book b1 = new Book("Gagan", "ABC", "1234", 111);
		System.out.println("The author of the book is: " + b1.getAuthor());
		//System.out.println("The title of the book is:" + b1.getTitle());
		//System.out.println("The callNumber is:" + b1.getCallNumber());

	}}
//.getNumberOfPages());