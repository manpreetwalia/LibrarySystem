package library.entities;

import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;

public class Book implements IBook 
{

	private String author; // author name
	private String title;  // Title of book
	private String callNumber; // contact number
	private int id; // integer variable
	
	private ILoan loan;
	private EBookState state;
	
	
	public Book(String author, String title, String callNumber, int bookID) 
	{
		if ( !sane(author, title, callNumber, bookID)) 
		{
			throw new IllegalArgumentException("Member: constructor : bad parameters");// throw illegal argument exception
		}
		
		this.author = author;
		this.title = title;
		this.callNumber = callNumber;
		this.id = bookID;
		this.state = EBookState.AVAILABLE;
		this.loan = null;
	}


	private boolean sane(String author, String title, String callNumber, int bookID) 
	{
		return  ( author != null     && !author.isEmpty()     &&
				  title != null      && !title.isEmpty()      &&
				  callNumber != null && !callNumber.isEmpty() &&
				  bookID > 0 );
	}

	
	@Override
	public void borrow(ILoan loan)
	{
		if (loan == null) 
		{
			throw new IllegalArgumentException(String.format("Book: borrow : Bad parameter: loan cannot be null"));
		}
		
		if (!(state == EBookState.AVAILABLE))
		{
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		
		this.loan = loan;
		state = EBookState.ON_LOAN;

	}

	
	@Override
	public ILoan getLoan() 
	{
		return loan;  // return value of loan
	}

	
	@Override
	public void returnBook(boolean damaged)
	{
		if (!(state == EBookState.ON_LOAN || state == EBookState.LOST))
		{
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		loan = null;
		if (damaged) 
		{
			state = EBookState.DAMAGED;
		}
		else
		{
			state = EBookState.AVAILABLE;
		}
	}

	
	@Override
	public void lose()
	{
		if (!(state == EBookState.ON_LOAN))
		{
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.LOST;
	}

	
	@Override
	public void repair() 
	{
		if (!(state == EBookState.DAMAGED))
		{
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.AVAILABLE;
	}

	
	@Override
	public void dispose() 
	{
		if (!(state == EBookState.AVAILABLE || state == EBookState.DAMAGED || state == EBookState.LOST)) {
			throw new RuntimeException(String.format("Illegal operation in state : %s", state));
		}
		state = EBookState.DISPOSED;
	}

	
	@Override
	public EBookState getState()
	{
		return state; // return state of book
	}

	
	@Override
	public String getAuthor()
	{
		return author; // returns author name
	}

	
	@Override
	public String getTitle() 
	{
		return title; // return title of book
	}

	
	@Override
	public String getCallNumber()
	{
		return callNumber; // return callnumber
	}

	
	@Override
	public int getID() {
		return id; // return id
	}

	
	@Override
	public String toString() 
	{
		return String.format("Id: %d\nAuthor: %s\nTitle: %s\nCall Number %s",
				id, author, title, callNumber);
	}

}
