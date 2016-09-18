package library.daos;

import java.util.Date; // import date package

import library.entities.Loan;
import library.interfaces.daos.ILoanHelper; // import interfaces of DAO 
import library.interfaces.entities.IBook;   // import interfaces for entities Book
import library.interfaces.entities.ILoan;   // import interfaces for entities loan
import library.interfaces.entities.IMember; // import interfaces for entities Member

public class LoanHelper implements ILoanHelper
{

	@Override
	public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate,
			Date dueDate) {

		return new Loan(book, borrower, borrowDate, dueDate); // returns new values of loan
	}

}
