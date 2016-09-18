package library.daos;

import library.entities.Book; // Import Library entities
import library.interfaces.daos.IBookHelper;// import library interface of DAO
import library.interfaces.entities.IBook; //  Import library interface of entities

public class BookHelper implements IBookHelper
{

	@Override
	public IBook makeBook(String author, String title, String callNumber, int id)
	{
		return new Book(author, title, callNumber, id);	 // return new entered detail of book
	}

}
