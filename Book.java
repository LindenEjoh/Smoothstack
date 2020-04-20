import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
	private static String bookId;
	private static String bookName;
	private static String authorId;
	private static String publisherId;
	
	public Book(String authorId, String bookName, Integer bookId, String publisherId) {
		this.setAuthorId(authorId);
		this.setBookName(bookName);
		this.setAuthorId(authorId);
		this.setPublisherId(publisherId);
	}

	public String getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(String publisherId) {
		Book.publisherId = publisherId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		Book.authorId = authorId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		Book.bookName = bookName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		Book.bookId = bookId;
	}
public static void addBook() throws IOException {
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("resources/projectfiles/Book.txt",true));
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Book ID: ");
		bookId = scan.nextLine();
		System.out.print("Enter the Book Name: ");
		bookName = scan.nextLine();
		System.out.print("Enter the Author ID: ");
		authorId = scan.nextLine();
		System.out.print("Enter the Publisher ID: ");
		publisherId = scan.nextLine();
		bw.write(bookId+"\t"+bookName+"\t"+authorId+"\t"+publisherId);
		bw.flush();
		bw.newLine();
		bw.close();		
	
}
public static void ViewBooks() throws IOException {
	BufferedReader br = new BufferedReader( new FileReader("resources/projectfiles/Book.txt") );
	String record;
	
	while( ( record = br.readLine() ) != null ) {
		System.out.println(record); 
	}		
    }
public static void DeleteBookByID() throws IOException {
	Scanner scan =  new Scanner(System.in);
	String record;
	File temp = new File("resources/projectfiles/Book_temp.txt");
	File newfile = new File("resources/projectfiles/Book.txt");
	BufferedReader br = new BufferedReader( new FileReader( newfile ) );
	BufferedWriter bw = new BufferedWriter( new FileWriter( temp ) );
	System.out.println("Enter the Book ID you want to delete: ");
	bookId =  scan.nextLine();
	while((record = br.readLine()) != null ) {
		if(!record.contains(bookId) ) 
			continue;
		bw.write(bookId);
		bw.flush();
		bw.newLine();
	}
	br.close();
	bw.close();
	newfile.delete();
	temp.renameTo(newfile);
}
public static void updateBookbyID() throws IOException {
	String newBookName,display, newBookId, newAuthorId, newAuthor, newPublisherId ;
	File newfile = new File("resources/projectfiles/Book.txt");
	File temp = new File("resources/projectfiles/Book_temp.txt");
	BufferedReader buffr = new BufferedReader( new FileReader(newfile) );
	BufferedWriter buffw = new BufferedWriter( new FileWriter(temp) ); 		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Book ID you would like to update: ");
	authorId = scan.nextLine();	    		  	   
	System.out.println("Enter the new Book ID: ");
	newBookId = scan.nextLine();    		
	System.out.println("Enter the new book name: ");
	newBookName = scan.nextLine();   
	System.out.println("Enter the new Author ID: ");
	newAuthorId = scan.nextLine();
	System.out.println("Enter the new Publisher ID: ");
	newPublisherId = scan.nextLine(); 
	while( (display = buffr.readLine() ) != null ) {
		if(display.contains(authorId)) {
			buffw.write(newBookName+"\t"+newBookId+"\t"+newAuthorId+"\t"+newPublisherId);
			buffw.flush();
		} else {
			buffw.write(display);	
		}    			
		buffw.newLine();
	}
	buffw.close();
	buffr.close();    		
	newfile.delete();    		
	boolean success = temp.renameTo(newfile);    		
	System.out.println(success);    		
}




}



