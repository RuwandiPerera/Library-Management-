class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title,String titleID,String author,int numPages){
		super(title,author);
		this.author=author;
		this.numPages=numPages;
	}
	public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
	}
}



