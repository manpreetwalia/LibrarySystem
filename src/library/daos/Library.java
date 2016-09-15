package library.daos;

import java.util.List;

import library.interfaces.daos.IBookDAO;
import library.interfaces.entities.IBook;

public class Library implements IBookDAO 
{

	@Override
	public IBook addBook(String author, String title, String callNo) {
		// TODO Auto-generated method stub
		return null;  // null
	}

	@Override
	public IBook getBookByID(int id) {
		// TODO Auto-generated method stub
		return null;
	} // TESTING

	@Override
	public List<IBook> listBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> findBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> findBooksByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> findBooksByAuthorTitle(String author, String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
