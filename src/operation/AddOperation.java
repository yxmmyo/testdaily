package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入添加图书的名字");
        String name = scanner.next();
        System.out.println("请输入添加图书的作者");
        String author = scanner.next();
        System.out.println("请输入添加图书的价格");
        int price = scanner.nextInt();
        System.out.println("请输入添加图书的类型");
        String type = scanner.next();
        System.out.println("添加成功");
        Book book = new Book(name,author,price,type);
        int current = bookList.getUsedSize();
        bookList.setBooks(bookList.getUsedSize(),book);
        bookList.setUsedSize(current+1);
        DisplayOperation displayOperation = new DisplayOperation();
        displayOperation.work(bookList);
    }
}
