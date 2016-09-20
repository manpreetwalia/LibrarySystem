package library.entities;



public class TestBook {
	public static void main(String[] args){
		Book b1= new Book("MANpreet", " ABC","2343",444);
		System.out.println("THE author is:" + b1.getAuthor());
		System.out.println("The title of book is:" + b1.getTitle());
		System.out.println("The callNumber of book is:" + b1.getCallNumber());
		System.out.println("The ID of book is:" + b1.getID());
		System.out.println("Details of b1 are " + b1.toString());
		System.out.println("The title of book is:" + b1.getID());
		System.out.println("The state of book is:" + b1.getState());
		System.out.println("The loan of book is:" + b1.getLoan());
	
	
	}
	
	
	
}
