package OnlineBookStore;


import java.util.List;

public class BookStore {

    String storeName;
    List<Book> books;

//    public BookStore(String storeName, List<Book> books) {
//        this.storeName = storeName;
//        this.books = books;
//    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println(getBooks());
    }

        public void purchaseBook(String title, int quantity, boolean isMember) {
        try {
            for (Book b : getBooks()) {
                if (b.getTitle() == title) {
                    if (isMember == true) {
                        System.out.println("bought the quantity{} books with  10 % discount: " + quantity);
                    } else {
                        System.out.println("bought the quantity{} books: " + quantity);
                    }
                } else {
                    System.out.println("Book not available");
                }
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}