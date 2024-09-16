package Assigment1;

//Write a java class to represent a book. 
//A book contains the following information: title, edition, publisher, and price. 
//You should provide a constructor for the creation of book objects and a method 
//to display the details of a book in the following format:
//Title
//Edition
//Publisher
//Price

public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book myBook = new Book("One Piece", "1", "	KPN", 11203);
		myBook.displayDetails();
	}
}

class Book {
	String title;
	String edition;
	String publisher;
	double price;
	
	public Book(String title, String edition, String publisher, double price) {
		this.title = title;
		this.edition = edition;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Title: " + title);
        System.out.println("Edition: " + edition);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
	}
	
	
}

