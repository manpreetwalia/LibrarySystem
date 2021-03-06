package library.daos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import library.interfaces.daos.IBookDAO;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

public class BookMapDAO implements IBookDAO {

	private int nextId;
	private Map<Integer, IBook> bookMap;
	private IBookHelper helper;
//Book map for data access objects
	
	public BookMapDAO(IBookHelper helper) {
		if (helper == null ) {
			throw new IllegalArgumentException(String.format("BookDAO : constructor : helper cannot be null."));
		}
		nextId = 1;
		this.helper = helper; 
		bookMap = new HashMap<Integer, IBook>();
	}
	//A map is instantiated for book helper
	public BookMapDAO(IBookHelper helper, Map<Integer, IBook> bookMap) {
		this(helper);
		if (helper == null ) {
			throw new IllegalArgumentException(String.format("BookDAO : constructor : bookMap cannot be null."));
		}
		this.bookMap = bookMap;
	}
	
	@Override
	// An overider class for addingBook
	public IBook addBook(String author, String title, String callNo) {
		int id = getNextId();
		IBook book = helper.makeBook(author, title, callNo, id);
		bookMap.put(Integer.valueOf(id), book);
		return book;
	}

	@Override
	//overrider class for getting book id
	public IBook getBookByID(int id) {
		if (bookMap.containsKey(Integer.valueOf(id))) {
			return bookMap.get(Integer.valueOf(id));
		}
		return null;
	}

	@Override
	public List<IBook> listBooks() {
		List<IBook> list = new ArrayList<IBook>(bookMap.values());
		return Collections.unmodifiableList(list);
	}

	@Override
	//initializing a list of books
	public List<IBook> findBooksByAuthor(String author) {
		if ( author == null || author.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("BookDAO : findBooksByAuthor : author cannot be null or blank"));
		}
		List<IBook> list = new ArrayList<IBook>();
		for (IBook b : bookMap.values()) {
			if (author.equals(b.getAuthor())) {
				list.add(b);
			}
		}
		return Collections.unmodifiableList(list);
	}

	@Override
	//function for finding the books by authors title
	public List<IBook> findBooksByTitle(String title) {
		if ( title == null || title.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("BookDAO : findBooksByAuthor : author cannot be null or blank"));
		}
		//listing books 
		List<IBook> list = new ArrayList<IBook>();
		for (IBook b : bookMap.values()) {
			if (title.equals(b.getTitle())) {
				list.add(b);
			}
		}
		return Collections.unmodifiableList(list);
	}
		/* else if(member.equalsIgnoreCase("member5"))
				 {
					 member5=  member5 - 10;//member5 loses book points for loan
		 		 System.out.println("Remaining balance is : "+ member1);
		 		 }*/
	@Override
	public List<IBook> findBooksByAuthorTitle(String author, String title) {
		if ( title == null || title.isEmpty() ||  author == null || author.isEmpty()) {
			throw new IllegalArgumentException(
				String.format("BookDAO : findBooksByAuthor : author and title cannot be null or blank"));
		}
		//List of items
		List<IBook> list = new ArrayList<IBook>();
		for (IBook b : bookMap.values()) {
			if (author.equals(b.getAuthor()) && title.equals(b.getTitle())) {
				list.add(b);
			}
		}
		return Collections.unmodifiableList(list);
	}
	
	private int getNextId() {
		return nextId++;
	}

}
