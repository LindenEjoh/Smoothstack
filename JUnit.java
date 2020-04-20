import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;


public class JUnit {
			@Test
			public void getAuthorIdTest() {
				
				Main main= new Main();
				Author author =new Author("4","Lindsay");
				assertEquals(author.getAuthorId(),"4");
			}
		
			@Test
public void getAuthorNameTest() {
				
				Main main= new Main();
				Author author =new Author("4","Lindsay");
				assertEquals(author.getAuthorName(),"Lindsay");
			}
			@Test
public void setAuthorIdTest() {
				
				Main main= new Main();
				Author author =new Author("10","Lindsay");
				author.setAuthorId("6");
				assertEquals(author.getAuthorId(),"6");
			}
			@Test
public void setAuthorNameTest() {
				
				Main main= new Main();
				Author author =new Author("4","Lindsay");
				author.setAuthorName("Lindsay9279");
				assertEquals(author.getAuthorName(),"Lindsay9279");
			}
			@Test
public void getPublisherIdTest() {
				
				Main main= new Main();
				Publisher publisher =new Publisher("4","Lindsay","7402");
				assertEquals(publisher.getPublisherId(),"4");
			}
			@Test
public void setPublisherIdTest() {
				
				Main main= new Main();
				Publisher publisher =new Publisher("4","Lindsay","7402");
				publisher.setPublisherId("5");
				assertEquals(publisher.getPublisherId(),"5");
			}
			@Test
public void setPublisherNameTest() {
				
				Main main= new Main();
				Publisher publisher =new Publisher("4","Lindsay","7402");
				publisher.setPublisherName("Linden");
				assertEquals(publisher.getPublisherName(),"Linden");
			}
			@Test
public void getPublisherNameTest() {
				
				Main main= new Main();
				Publisher publisher =new Publisher("4","7402","Lindsay");
				assertEquals(publisher.getPublisherName(),"Lindsay");
			}
			@Test
public void setAddressTest() {
				
				Main main= new Main();
				Publisher publisher =new Publisher("4","Lindsay","7402");
				publisher.setAddress("8801");
				assertEquals(publisher.getAddress(),"8801");
			}
			@Test
public void getAddressTest() {
				
				Main main= new Main();
				Publisher publisher =new Publisher("4","8801","Lindsay");
				assertEquals(publisher.getAddress(),"8801");
			}
}