
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Author implements Serializable{ 

	private static final long serialVersionUID = 8616628457974986169L;
	private static String authorId;
	private static String authorName;
	
	  
	
	public Author(String authorId, String authorName) {
		Author.authorId = authorId;
		Author.authorName = authorName;
	}
	/**
	 * @return the authorId
	 */
	public String getAuthorId() {
		return authorId;
	}
	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(String authorId) {
		Author.authorId = authorId;
		
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		Author.authorName = authorName;
	}
	public static void AddRecordAuthor() throws IOException {
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("resources/projectfiles/Author.txt",true));
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Author ID: ");
		authorId = scan.nextLine();
		System.out.print("Enter the Author Name: ");
		authorName = scan.nextLine();
		bw.write(authorId+"\t"+authorName);
		bw.flush();
		bw.newLine();
		bw.close();		
	
}

public static void ViewAuthor() throws IOException {
	BufferedReader br = new BufferedReader( new FileReader("resources/projectfiles/Author.txt") );
	String record;
	
	while( ( record = br.readLine() ) != null ) {
		System.out.println(record); 
	}		
    }
public static void DeleteAuthorByID() throws IOException {
	Scanner scan =  new Scanner(System.in);
	String record;
	File temp = new File("resources/projectfiles/Author_temp.txt");
	File newfile = new File("resources/projectfiles/Author.txt");
	BufferedReader br = new BufferedReader( new FileReader( newfile ) );
	BufferedWriter bw = new BufferedWriter( new FileWriter( temp ) );
	System.out.println("Enter the Author ID you want to delete: ");
	authorId =  scan.nextLine();
	while((record = br.readLine()) != null ) {
		if(!record.contains(authorId) ) 
			continue;
		bw.write(authorId);
		bw.flush();
		bw.newLine();
	}
	br.close();
	bw.close();
	newfile.delete();
	temp.renameTo(newfile);
}

public static void updateAuthorbyID() throws IOException {
	String newAuthorId,display;
	File newfile = new File("resources/projectfiles/Author.txt");
	File temp = new File("resources/projectfiles/Author_temp.txt");
	BufferedReader buffr = new BufferedReader( new FileReader(newfile) );
	BufferedWriter buffw = new BufferedWriter( new FileWriter(temp) ); 		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Author ID you would like to update: ");
	authorId = scan.nextLine();	    		  	   
	System.out.println("Enter the new Name: ");
	authorName = scan.nextLine();    		
	System.out.println("Enter the new ID: ");
	newAuthorId = scan.nextLine();   
	while( (display = buffr.readLine() ) != null ) {
		if(display.contains(authorId)) {
			buffw.write(newAuthorId+"\t"+authorName);
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