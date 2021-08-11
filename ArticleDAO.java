package org.eample.DAO;

import org.eample.exception.AppException;
import org.eample.model.Article;
import org.eample.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {
    public static List<Article> queryByUserId(Integer userId) {
        List<Article> list = new ArrayList<>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = DBUtil.getConnection();
            String sql = "select id,title from article where user_id=?";
            ps = c.prepareStatement(sql);
            //设置占位符
            ps.setInt(1,userId);
            rs = ps.executeQuery();
            while(rs.next()) {
                Article a = new Article();
                //结果集取值设置到文章对象
                a.setId(rs.getInt("id"));
                a.setTitle(rs.getString("title"));
                list.add(a);
            }
            return list;
        } catch (Exception e) {
            throw new AppException("ART001","查询文章列表出错",e);
        } finally {
            DBUtil.close(c,ps,rs);
        }











    }
}
