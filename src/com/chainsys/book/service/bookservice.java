package com.chainsys.book.service;

import com.chainsys.book.exception.booknotfoundexception;
import com.chainsys.book.model.book;
//import java.util.List;
import java.util.Set;
import java.time.LocalDate;
import java.util.List;
import java.time.format.DateTimeFormatter;
public interface bookservice {

	book findbyname(String name) throws booknotfoundexception;
	book findbyid(int id) throws booknotfoundexception;
	book deletebyid(int id) throws booknotfoundexception;
	book findByDate(LocalDate date) throws booknotfoundexception;
	List<String> findAllName();
}
