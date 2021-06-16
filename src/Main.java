import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;
import java.util.Scanner;

public class Main {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = scanner.next();
        System.out.println("请输入您的身份(1 表示管理员, 0 表示普通用户):");
        int who = scanner.nextInt();
        if (who == 1) {
            return new AdminUser(name);
        }
        return new NormalUser(name);
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }

    }
}