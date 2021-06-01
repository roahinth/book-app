package com.chainsys.book.dao;

import com.chainsys.book.model.book;

public interface bookdao {
	
	book findbyname(String name);
	
	book findbyid(int id);
	book deletebyid(int id);
}
