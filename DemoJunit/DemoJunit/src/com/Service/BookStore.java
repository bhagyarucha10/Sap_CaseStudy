package com.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.Exception.InvalidBookException;
import com.Model.Book;

public class BookStore 
{	
	ArrayList<Book> a1 = new ArrayList<>();
	public Book addBook(Book b)	throws Exception				// To add a new Book object into the collection.
	{
		a1.add(b);
		return b;
	}

	public Book searchByTitle(String title)	throws Exception	// Search a book based on title and if found, display the details
	{
		Iterator<Book> i = a1.iterator();
		Book b=null;
		while(i.hasNext())
		{
			b = i.next();
			if((b.title).equals(title)) 
			{
				System.out.println("Book ID "+b.bookID+", Title "+b.title+", Author "+b.author+", Category "+b.category+", Price "+b.price+"");
				break;
			}
			else {		
				throw new InvalidBookException("Title Not Found");
			}
			
		}
		return b;
	}

	public Book searchByAuthor(String author) throws Exception	// Search a book based on author and if found, display the details
	{
		Iterator<Book> i = a1.iterator();
		Book b=null;
		while(i.hasNext())
		{
			b = i.next();
			if((b.author).equals(author)) {
				System.out.println("Book ID "+b.bookID+", Title "+b.title+", Author "+b.author+", Category "+b.category+", Price "+b.price+"");
				break;
			}
			else
				throw new InvalidBookException("Author Not Found");
		}
		return b;		
	}

	public List<Book> displayAll()					// Print the details of all the books
	{
		Iterator<Book> i = a1.iterator();
		System.out.println("Book ID | \tTitle | \tAuthor | \t Category | \t Price");
		System.out.println("---------------------------------------------------------------------------");
		while(i.hasNext()) {
			Book b = i.next();
			System.out.println(b.bookID+"\t\t"+b.title+"\t\t"+b.author+"\t\t"+b.category+"\t\t"+b.price+"");
			
		}
		return a1;
	}	
}

