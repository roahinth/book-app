package com.chainsys.book.dao;

import com.chainsys.book.model.book;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.time.format.DateTimeFormatter;
public interface bookdao {
	
	book findbyname(String name);
	
	book findbyid(int id);
	book deletebyid(int id);
	book findByDate(LocalDate date);
	List<String> findallname()
}
