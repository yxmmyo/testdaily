package operation;

import book.Book;
import book.BookList;

import java.util.Arrays;

public class DisplayOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("显示所有的书籍");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
