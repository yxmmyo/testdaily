package org.eample.servlet;

import org.eample.DAO.ArticleDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/articleDelete")
public class ArticleDeleteServlet extends AbstractBaseServlet{


    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String ids = req.getParameter("ids");
        int sum = ArticleDAO.delete(ids.split(","));
        return null;
    }
}
















