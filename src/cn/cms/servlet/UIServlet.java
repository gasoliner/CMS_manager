package cn.cms.servlet;

import cn.cms.util.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UIServlet extends HttpServlet {

    public UIServlet() throws IOException {
        PageUtil pageUtil = new PageUtil();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURL().toString();
        String ui = PageUtil.getRequestName(url);
        req.getRequestDispatcher("/WEB-INF/jsp/"+ui+".jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}