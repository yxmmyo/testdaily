class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}

class PassError extends Exception {
    public PassError(String message) {
        super(message);
    }
}
public class TestDemo_1103 {

    private static String username = "admin";
    private static String password = "123456";

    public static void main(String[] args) {
        try {
            login("admin","123456");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PassError passError) {
            passError.printStackTrace();
        }
    }

    private static void login(String admin, String s) throws UserError,PassError {
        if (!username.equals("admin")) {
            throw new UserError("用户名错误");
        }
        if (!password.equals("123456")) {
            throw new PassError("密码错误");
        }
        System.out.println("登录成功");
    }
}
