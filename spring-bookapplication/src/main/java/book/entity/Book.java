package book.entity; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="book")
public class Book { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	@Column(length = 50)
	private String title;
	@Column(length = 50)
	private String authors;
	@Column(length = 50 )
	private String publications;
	@Column
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getPublications() {
		return publications;
	}
	public void setPublications(String publications) {
		this.publications = publications;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", authors=" + authors + ", publications=" + publications
				+ ", price=" + price + "]";
	}
	public Book() {
		
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String title, String authors, String publications, double price) {
		
		this.bookId = bookId;
		this.title = title;
		this.authors = authors;
		this.publications = publications;
		this.price = price;
	}
	

}
