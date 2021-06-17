package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的图书的名字");
        String name = scanner.nextLine();
        int pos = 0;
        int length = bookList.getUsedSize();
        for (int i = 0; i < length; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName())) {
                pos = i;
                break;
            }
        }
        if (pos >= bookList.getUsedSize()) {
            System.out.println("没有要删除的书");
            return;
        }
        int current = bookList.getUsedSize();
        for (int i = pos; i < bookList.getUsedSize()-1; i++) {
            Book book = bookList.getBook(i+1);
            bookList.setBooks(i,book);
        }
        bookList.setUsedSize(current-1);
        System.out.println("删除成功");
        DisplayOperation displayOperation = new DisplayOperation();
        displayOperation.work(bookList);
    }
}
