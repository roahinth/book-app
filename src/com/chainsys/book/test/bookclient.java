package com.chainsys.book.test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Set;

import com.chainsys.book.exception.booknotfoundexception;
import com.chainsys.book.model.book;
import com.chainsys.book.service.bookservice;
import com.chainsys.book.service.bookserviceimpl;

import java.time.LocalDate;
import java.util.List;
import java.time.format.DateTimeFormatter;
public class bookclient {
	public static void main(String[] args) {

		
		bookservice service = new bookserviceimpl();
		String date;
		DateTimeFormatter dateFormat;
		String name;
		int id;
		System.out.println("Enter the choice");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		List<String> nlist;
		switch (choice) {
		case 1:
			System.out.println("Find the Author By name to find details");
			System.out.println("Enter the Author name");
			name = scanner.next();
			try {
				book pro = service.findbyname(name);
				System.out.println(pro);
			} catch (booknotfoundexception e) {
			}
			break;
		case 2:
			System.out.println("Find the Author By id to find details");
			System.out.println("Enter the Author id");
			id = scanner.nextInt();
			try {
				book pro = service.findbyid(id);
				System.out.println(pro);
			} catch (booknotfoundexception e) {
			}
			break;
		case 3:
			System.out.println("delete the Author details By entering id");
			System.out.println("Enter the Author id");
			id = scanner.nextInt();
			try {
				book pro = service.deletebyid(id);
				System.out.println(pro);
			} catch (booknotfoundexception e) {
			}
			break;
		case 4:
			System.out.println("Find the Author By Date");
			System.out.println("Enter the Author book launch Date");
			date = scanner.next();
			dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			try {
				book book = service.findByDate(LocalDate.parse(date,dateFormat));
				System.out.println(book);
			} catch (booknotfoundexception e) {
			}
			break;	
		case 5:
			System.out.println("Find All Author Name");
			nlist = service.findAllName();
			System.out.println(nlist);
			break;

		default:
			break;
		}
		scanner.close();
	}
}
