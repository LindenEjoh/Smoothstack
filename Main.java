import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
        String decision,cont = "y";        
        
        while( cont.equalsIgnoreCase("y") ) {        	
	        System.out.println("Type 1 to Add New Author ");
	        System.out.println("Type 2 to View Authors ");
	        System.out.println("Type 3 to Delete Author ");
	        System.out.println("Type 4 to Update Author");	
	        System.out.println("Type 5 to Add Books");	
	        System.out.println("Type 6 to View Books");	
	        System.out.println("Type 7 to Delete Books ");
	        System.out.println("Type 8 to Update Books ");
	        System.out.println("Type 9 to Add Publisher ");
	        System.out.println("Type 10 to Update Publisher ");	
	        System.out.println("Type 11 to View Publisher ");
	        System.out.println("Type 12 to Delete Publisher ");
	    
	        System.out.print("\n\n");
	        System.out.println("Enter your choice: ");
	        decision = scan.nextLine();
	        
	        if( decision.equals("1") ) {
	        		Author.AddRecordAuthor();
	        } 
	        else if( decision.equals("2") ) {
	        		Author.ViewAuthor();
	        
	        } else if( decision.equals("3") ) {
	        	Author.DeleteAuthorByID();
	        
	        }	else if( decision.equals("4") ) {
	        		Author.updateAuthorbyID();
	        }
	        	else if( decision.equals("5") ) {
	        		Book.addBook();
	        }	
	        	else if( decision.equals("6") ) {
	        		Book.ViewBooks();
	        }		
	        	else if( decision.equals("7") ) {
	        		Book.DeleteBookByID();
	        }	
	        	else if( decision.equals("8") ) {
	        		Book.updateBookbyID();
	        }	
	        	else if( decision.equals("9") ) {
	        		Publisher.AddPublisher();
	        }	
	        	else if( decision.equals("10") ) {
	        		Publisher.updatePublisherbyID();
	        }	
	        	else if( decision.equals("11") ) {
	        		Publisher.ViewPublisher();
	        }	
	        	else if( decision.equals("12") ) {
	        		Publisher.DeletePublisherByID();
	        }	
	        System.out.println("continue? Y/N");
	        cont = scan.nextLine();
	       	
        }
 		
}
}
