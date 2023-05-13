package com.demo.collection;

public class Book implements Comparable<Book>  {
int book_id;
String book_name;
double book_price;
String book_author;
public Book(int book_id, String book_name, double book_price, String book_author) {
	super();
	this.book_id = book_id;
	this.book_name = book_name;
	this.book_price = book_price;
	this.book_author = book_author;
}
@Override
public String toString() {
	return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_price=" + book_price + ", book_author="
			+ book_author + "]";
}
@Override
public int compareTo(Book arg0) {
	// TODO Auto-generated method stub
	return 0;
}
	
	
	

}
