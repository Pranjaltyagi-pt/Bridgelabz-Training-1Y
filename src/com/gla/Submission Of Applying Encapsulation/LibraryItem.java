abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Encapsulated borrower info
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    protected void setBorrower(String name) {
        this.borrowerName = name;
        this.isAvailable = false;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    protected String getBorrower() {
        return borrowerName;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        if (!isAvailable) {
            System.out.println("Borrowed by: " + borrowerName);
        }
    }
}