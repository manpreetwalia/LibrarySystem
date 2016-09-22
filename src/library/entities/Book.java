package library.entities;

import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;

public class Book implements IBook {

	
	private String author;  // declare author as string
	private String title;  // declare title of book as string variable
	private String callNumber; // declare the callnumber as string
	private int id; // declare id as integer
	 
	private ILoan loan; // create the object of ILoan class
	private EBookState state; // cretae tyhe object of EBookState
	
	// declare the  parametrize constructor of book entity/class with four parameters
	public Book(String author, String title, String callNumber, int bookID) {
		if ( !sane(author, title, callNumber, bookID)) {
			throw new IllegalArgumentException("Member: constructor : bad parameters"); // throw exception
		}
		this.author = author;
		this.title = title;
		this.callNumber = callNumber;
		this.id = bookID;
		this.state = EBookState.AVAILABLE;
		this.loan = null;
	}


	private boolean sane(String author, String title, String callNumber, int bookID) {
		return  ( author != null     && !author.isEmpty()     &&
				  title != null      && !title.isEmpty()      &&
				  callNumber != null && !callNumber.isEmpty() &&
				  bookID > 0 
				);
	}

	
	@Override
	public void borrow(ILoan loan)
	{
		// checks the condition
		if (loan == null) {
			throw new IllegalArgumentException(String.format("Book: borrow : Bad parameter: loan cannot be null"));
		}
		
		// checks the condition
		if (!(state == EBookState.AVAILABLE)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		this.loan = loan;
		state = EBookState.ON_LOAN;

	}
// 	// declare the getloan functio
	
	@Override
	public ILoan getLoan() {
		return loan;
	}

	// declare the returnbook function
	@Override
	public void returnBook(boolean damaged) {
		if (!(state == EBookState.ON_LOAN || state == EBookState.LOST)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		loan = null;
		if (damaged) {
			state = EBookState.DAMAGED;
		}
		else {
			state = EBookState.AVAILABLE;
		}
	}
//declare the lose function with condition
	
	@Override
	public void lose() {
		if (!(state == EBookState.ON_LOAN)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.LOST;
	}
// declare the repair function which donot return any value
	
	@Override
	public void repair() {
		if (!(state == EBookState.DAMAGED)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.AVAILABLE;
	}

	// declare the disposek functio	
	@Override
	public void dispose() {
		if (!(state == EBookState.AVAILABLE || state == EBookState.DAMAGED || state == EBookState.LOST)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.DISPOSED;
	}
	// declare the ebookstate function
	
	@Override
	public EBookState getState() {
		return state;
	}

	
	@Override
	public String getAuthor() {
		return author;
	}

	
	@Override
	public String getTitle() {
		return title;
	}

	
	@Override
	public String getCallNumber() {
		return callNumber;
	}

	
	@Override
	public int getID() {
		return id;
	}

	
	@Override
	public String toString() {
		return String.format("Id: %d\nAuthor: %s\nTitle: %s\nCall Number %s",
				id, author, title, callNumber);
	}

}
