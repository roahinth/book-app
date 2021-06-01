package com.chainsys.book.test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
//import java.util.Set;
import java.util.Set;

import com.chainsys.book.exception.booknotfoundexception;
import com.chainsys.book.model.book;
import com.chainsys.book.service.bookservice;
import com.chainsys.book.service.bookserviceimpl;

public class bookclient {
	public static void main(String[] args) {

		//Set<Product> productSet;
		bookservice service = new bookserviceimpl();
		String date;
		DateTimeFormatter dateFormat;
		String name;
		System.out.println("Enter the choice");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
	//	List<String> l;
	//	List<Integer> f;
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
		default:
			break;
		}
		scanner.close();
	}
}
