package com.chainsys.book.service;

import com.chainsys.book.exception.booknotfoundexception;
import com.chainsys.book.model.book;

public interface bookservice {

	book findbyname(String name) throws booknotfoundexception;
}
