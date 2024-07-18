package OnlineBookStore;

import java.util.ArrayList;
import java.util.List;


public class BookMain {
       public static void main(String[] args){
              List<Book> bookList = new ArrayList<>();
              Book b=new Book("Effective Java","Joshua Bloch",45,10);
              bookList.add(b);
              Book b1=new Book("Java:The Complete Reference","Herbert Schildt",55,5);
              bookList.add(b1);

              BookStore bs=new BookStore();
              bs.setBooks(bookList);
              bs.purchaseBook("Effective Java",5,true);
              bs.purchaseBook("Java:The Complete Reference",7,false);


       }
}
