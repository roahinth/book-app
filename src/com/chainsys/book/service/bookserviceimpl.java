package com.chainsys.book.service;


//import java.util.Set;

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
}







