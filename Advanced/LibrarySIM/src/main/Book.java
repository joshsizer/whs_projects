package main;

public class Book {
	public static final long DEFAULT_ISBN = 1111111111;
	private final String title;
	private final String author;
	private final String subject;
	private final String ISBN;
	private final int pages;
	
	/**
	 * The one and only constructor of a book object. After this, you cannot set any
	 * of this books properties. Once ya make a book, ya can't go changing it! I guess 
	 * its a design choice really. Instead of changing the properties of a book, just 
	 * make a new one and remove references to the old one.
	 * 
	 * @param title The title of this book. This object will not capitalize the title for you.
	 * @param author The author of this book.
	 * @param subject The subject of this book, ie art, science, bridges.
	 * @param ISBN The international standard book number. Must be 10 digits long.
	 * @param pages The number of pages in this book.
	 */
	public Book(String title, String author, String subject, String ISBN, int pages) throws NumberFormatException {
		if (ISBN.length() != 10)
			throw new NumberFormatException("ISBN must be a 10 digit number");
		this.title = title;
		this.author = author;
		this.subject = subject;
		this.ISBN = ISBN;
		this.pages = pages;
	}
	
	public Book(Book b) {
		this(b.getTitle(), b.getAuthor(), b.getSubject(), b.getISBN(), b.getPages());
	}

	/**
	 * Gets the title of this book.
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Gets the author of this book.
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Gets the subject of this book.
	 * @return subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Gets the ISBN of this book.
	 * @return ISBN
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Gets the number of pages in this book.
	 * @return pages
	 */
	public int getPages() {
		return pages;
	}
	
	@Override
	public String toString() {
		return "Title: " + this.title + "; Author: " + this.author + "; Subject: " + this.subject
				+ "; ISBN: " + this.ISBN + "; Pages: " + Integer.toString(this.pages);
	}
	@Override
	public boolean equals(Object b) {
		if (b instanceof String)
			return this.title.equals(b);
		else if (!(b instanceof Book))
			return false;
			
		Book book = (Book)b;
		return ( this.title.equals(book.getTitle()) 
				&& this.author.equals(book.getAuthor())
				&& this.subject.equals(book.getSubject())
				&& this.ISBN.equals(book.getISBN())
				&& this.pages == book.getPages());
	}
}
