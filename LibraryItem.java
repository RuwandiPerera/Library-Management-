public abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean isCheckedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        if (isCheckedOut) {
            System.out.println("This item is already checked out.");
        } else {
            isCheckedOut = true;
            System.out.println("Item checked out successfully.");
        }
    }

    public void checkIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Item checked in successfully.");
        } else {
            System.out.println("This item is already checked in.");
        }
    }

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
        System.out.println("Checked out: " + (isCheckedOut ? "Yes" : "No"));
    }
}


