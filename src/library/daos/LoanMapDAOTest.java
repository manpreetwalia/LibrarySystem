package library.daos;

import library.entities.Book;

import library.entities.Member;

import java.util.Date;

import java.util.Calendar;

public class LoanMapDAOTest {

	public static void main(String[] args) {

		LoanHelper hlpr = new LoanHelper();

		Date borrowDate = new Date();

		Date dueDate = new Date();

		Book book2 = new Book("Manpreet Walia", "Introduction to Java", "89656789", 5564);

		Member borrower2 = new Member("Manpreet", "Walia", "4566789", "manpreetwalia02@gmail.com", 856);

		LoanMapDAO lmd = new LoanMapDAO(hlpr);

		System.out.println(book2.getLoan());

		System.out.println(lmd.getLoanByID(1));

		System.out.println(hlpr.makeLoan(book2, borrower2, borrowDate, dueDate));

	}

}
