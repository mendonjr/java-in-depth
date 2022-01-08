public class Instructor {
    public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;
	
	public Instructor(long id, String name, String title, String department, Book[] books) {
		this(id, name, title, department);
		this.books = books;
	}
	
	public Instructor(long id, String name, String title, String department) {
		this(id, name, title);
		this.department = department;
	}
	
	public Instructor(long id, String name, String title) {
		this(id, name);
		this.title = title;
	}
	
	public Instructor(long id, String name) {
		this(id);
		this.name = name;
	}
	
	public String getMostRecentBookTitle() {
		return books[books.length-1].getTitle();
	}
	
	public Book updateBook(int index, String title) {
		Book oldBook = new Book(books[index].getTitle()); // create temp book object with title = title of book at that particular index ;
		books[index].setTitle(title);          //update the title of the book at that index with new title
		return oldBook;                // return the temp book instance with old title
	}
	
	public Book updateBook(int index, Book book) {
		Book oldBook = books[index];
		books[index] = book;
		return oldBook;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");
		
		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
		System.out.println(instructor.getMostRecentBookTitle());
		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());
				
		Book book4 = new Book("Introduction to Data Mining");
		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
	}
}