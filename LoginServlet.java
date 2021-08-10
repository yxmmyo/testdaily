package org.eample.servlet;

import org.eample.exception.AppException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("abc".equals(username)) {//模拟用户名密码校验
            return null;
        } else {
            throw new AppException("LOG001","用户名密码错误");
        }





    }
}
