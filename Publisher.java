import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Publisher {
	private static String publisherId;
	private static String publisherName;
	private  static String address;
	
	public Publisher(String publisherId, String address, String publisherName) {
		this.setPublisherId(publisherId);
		this.setPublisherName(publisherName);
		this.setAddress(address);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		Publisher.address = address;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		Publisher.publisherName = publisherName;
	}

	public String getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(String publisherId2) {
		Publisher.publisherId = publisherId2;
	}
public static void AddPublisher() throws IOException {
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("resources/projectfiles/Publisher.txt",true));
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Publisher ID: ");
		publisherId = scan.nextLine();
		System.out.print("Enter the Publisher Name: ");
		publisherName = scan.nextLine();
		System.out.print("Enter the Publisher address: ");
		address = scan.nextLine();
		bw.write(publisherId+"\t"+publisherName+"\t"+address);
		bw.flush();
		bw.newLine();
		bw.close();		
}
public static void ViewPublisher() throws IOException {
	BufferedReader br = new BufferedReader( new FileReader("resources/projectfiles/Publisher.txt") );
	String record;
	
	while( ( record = br.readLine() ) != null ) {
		System.out.println(record); 
	}		
    }
public static void DeletePublisherByID() throws IOException {
	Scanner scan =  new Scanner(System.in);
	String record;
	File temp = new File("resources/projectfiles/Publisher_temp.txt");
	File newfile = new File("resources/projectfiles/Publisher.txt");
	BufferedReader br = new BufferedReader( new FileReader( newfile ) );
	BufferedWriter bw = new BufferedWriter( new FileWriter( temp ) );
	System.out.println("Enter the Publisher ID you want to delete: ");
	publisherId =  scan.nextLine();
	while((record = br.readLine()) != null ) {
		if(record.contains(publisherId)) 
			continue;
		bw.write(publisherId);
		bw.flush();
		bw.newLine();
	}
	br.close();
	bw.close();
	newfile.delete();
	temp.renameTo(newfile);
}
public static void updatePublisherbyID() throws IOException {
	String newPublisherId,display, newPublisherName, newAddress;
	File newfile = new File("resources/projectfiles/Publisher.txt");
	File temp = new File("resources/projectfiles/Publisher_temp.txt");
	BufferedReader buffr = new BufferedReader( new FileReader(newfile) );
	BufferedWriter buffw = new BufferedWriter( new FileWriter(temp) ); 		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Publisher ID you would like to update: ");
	publisherId = scan.nextLine();	    		  	   
	System.out.println("Enter the new publisher ID: ");
	newPublisherId = scan.nextLine();    		
	System.out.println("Enter the new name: ");
	newPublisherName = scan.nextLine(); 
	System.out.println("Enter the new address: ");
	newAddress = scan.nextLine();
	while( (display = buffr.readLine() ) != null ) {
		if(display.contains(newPublisherId)) {
			buffw.write(newPublisherId+"\t"+newPublisherName+"\t"+newAddress);
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
