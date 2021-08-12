package org.eample.servlet;

import org.eample.DAO.ArticleDAO;
import org.eample.model.Article;
import org.eample.model.User;
import org.eample.util.jsonUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.InputStream;

@WebServlet("/articleAdd")
public class ArticleAddServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        HttpSession session = req.getSession(false);
        User user = (User)session.getAttribute("user");
        //请求数据类型是application/json，需要使用输入流获取
        InputStream is = req.getInputStream();
        Article a = jsonUtil.deserialize(is,Article.class);
        a.setUserId(user.getId());
        int num = ArticleDAO.insert(a);
        return null;
    }
}








