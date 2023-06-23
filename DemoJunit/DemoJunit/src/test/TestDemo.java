package test;



import com.Model.Book;
import com.Service.BookStore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class TestDemo {

	    private List<Book> books=new ArrayList();
	    private BookStore bookstore=new BookStore();

	    /*@BeforeAll
	    public static void setUp() {
	    	try {
	    List<Book>    books = new ArrayList<>();
	      BookStore   bookstore=new BookStore();
	        Book b1=new Book("B123", "Java", "James Gosling","Technology",400);
	        Book b2=new Book("B234", "Clean Code", "Robert C. Martin","Science",890);
	        Book b3=new Book("B345", "Design Patterns", "Erich Gamma","Technology",670);
	        Book b4=new Book("B345", "Concurrency in Practice", "Brian Goetz","Technology",500);
	        bookstore.addBook(b1);
	        bookstore.addBook(b2);
	        bookstore.addBook(b3);
	        bookstore.addBook(b4);
	       //bookstore = new BookStore(books);
	      }
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    }
*/
	    @Test
	    public void testAddBook()  {
	     
	    	try{
	    		Book newBook = new Book("B345", "Concurrency in Practice", "Brian Goetz","Technology",500.0f);
	    	
	        Book b= bookstore.addBook(newBook);
	       assertEquals("B345",b.getBookID());
	       assertEquals("Concurrency in Practice",b.getTitle());
	       assertEquals("Brian Goetz",b.getAuthor());
	       assertEquals("Technology",b.getCategory());
	       Book newBook1= new Book("B234", "Clean Code", "Robert C. Martin","Science",890);
	       bookstore.addBook(newBook1);
	        //Book b= bookstore.addBook(newBook);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    }

	    @Test
	    public void testSearchByTitle() {
	    	try {
	    		testAddBook();
	        String titleToSearch = "Concurrency in Practice";
	        Book foundBooks = bookstore.searchByTitle(titleToSearch);
	       // System.out.println("swwerta"+foundBooks);
	        Assertions.assertEquals("Concurrency in Practice", foundBooks.getTitle());
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	       
	    }

	    @Test
	    public void testSearchByAuthor() {
	    	try {
	    	testAddBook();
	        String authorToSearch = "Brian Goetz";
	        Book foundBooks = bookstore.searchByAuthor(authorToSearch);
	        Assertions.assertEquals("Brian Goetz", foundBooks.getAuthor());
	        
	    }
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    }
	    
	    
	


}



