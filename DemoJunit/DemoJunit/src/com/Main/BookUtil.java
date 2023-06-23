package com.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.Exception.InvalidBookException;
import com.Model.Book;
import com.Service.BookStore;

public class BookUtil {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception 
	{
		BookStore bs = new BookStore();
		String bookID;
		String title;
		String author;
		String category;
		float price;		

	   Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the 3 Book Details...");

		for(int i=0; i<1; i++)
		{
			bookID = scan.next();
			title = scan.next();
			author = scan.next();
			category = scan.next();
			price = scan.nextFloat();		

			if(bookID.startsWith("B") && bookID.length()==4)
			{
				if(category.equals("Science") || category.equals("Fiction") || category.equals("Technology") || category.equals("Others"))
				{
					if(price > 0)
					{
						bs.addBook(new Book(bookID, title, author, category, price));
					}
				}
			}
			else {
				throw new InvalidBookException("Invalid Book");
			}
		} 
		System.out.println("---------------------------------------------------------------------------");
	    bs.searchByTitle("Java");
	    System.out.println("----------------------------------------------------------------");
		bs.searchByAuthor("Gosling");
		System.out.println("----------------------------------------------------------------");
		bs.displayAll();
	}	
}