class LibraryMember extends LibraryItem{
	private String memberID;
	private String name;
	
	public LibraryMember(String title,String titleID,String memberID,String name){
		super(title,titleID);
		this.memberID=memberID;
		this.name=name;
	}
	public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
    }
}

