class Magazine extends LibraryItem{
    private String issueDate;
	private String publisher;
	
	public Magazine(String title,String titleID,String issueDate,String publisher){
		super(title,titleID);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Publisher: " + publisher);
    }
}

