package com.chainsys.book.service;


//import java.util.Set;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.time.format.DateTimeFormatter;
import com.chainsys.book.dao.bookdao;
import com.chainsys.book.dao.bookdaoimpl;
import com.chainsys.book.exception.booknotfoundexception;
import com.chainsys.book.model.book;

public class bookserviceimpl implements bookservice {
	private static bookdao dao;

	public bookserviceimpl() {
		dao = new bookdaoimpl();
	}


	@Override
	public book findbyname(String name) throws booknotfoundexception {
		// TODO Auto-generated method stub
		book  book = dao.findbyname(name);
		if (book == null) {
			throw new booknotfoundexception("Author name Not Found");
		} else {
		return book;
	}
}
	public book findbyid(int id) throws booknotfoundexception {
		// TODO Auto-generated method stub
		book  book = dao.findbyid(id);
		if (book == null) {
			throw new booknotfoundexception("Author Id Not Found");
		} else {
		return book;
	}
}
	public book deletebyid(int id) throws booknotfoundexception {
		// TODO Auto-generated method stub
		book  book = dao.deletebyid(id);
		if (book == null) {
			throw new booknotfoundexception("Author Id Not Found");
		} else {
		return book;
	}
}
	public book findByDate(LocalDate date) throws booknotfoundexception {
		book book = dao.findByDate(date);
		if (book == null) {
			throw new booknotfoundexception("Author Name Not Found");
		} else {
			return book;
		}
	}
	public List<String> findAllName() {
		return dao.findallname();
	}
}







