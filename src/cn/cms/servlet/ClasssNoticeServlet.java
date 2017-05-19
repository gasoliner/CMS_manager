package cn.cms.servlet;

import cn.cms.po.ClassInfo;
import cn.cms.po.ClassNotice;
import cn.cms.po.DataGrid;
import cn.cms.po.Page;
import cn.cms.service.ClassNoticeService;
import cn.cms.service.impl.ClassNoticeServiceImpl;
import cn.cms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class ClasssNoticeServlet extends HttpServlet {
    
    private ClassNoticeService classNoticeService = new ClassNoticeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("add")){
            resp.getWriter().print(addtion(req));
        }else if (requestName.equals("list")){
            resp.getWriter().print(list(req));
        }else if (requestName.equals("delete")){
            resp.getWriter().print(delete(req));
        }else {
            resp.getWriter().print(update(req));
        }
    }

    private String delete(HttpServletRequest req) {
        classNoticeService.delete(Integer.parseInt(req.getParameter("cnid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        classNoticeService.update(getObjectByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(classNoticeService.getList(page));
        dataGrid.setTotal(classNoticeService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String addtion(HttpServletRequest request){
        classNoticeService.insert(getObjectByRequest(request));
        return JSON.toJSONString("successful");
    }

    public ClassNotice getObjectByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        ClassNotice cn = new ClassNotice();
        if (parameterMap.get("cnid")!=null && parameterMap.get("cnid").length > 0){
            cn.setCnid(Integer.parseInt(parameterMap.get("cnid")[0]));
        }
        if (parameterMap.get("classs")!=null && parameterMap.get("classs").length > 0){
            cn.setClasss(parameterMap.get("classs")[0]);
        }
        if (parameterMap.get("title")!=null &&parameterMap.get("title").length > 0){
            cn.setTitle(parameterMap.get("title")[0]);
        }
        if (parameterMap.get("content")!=null &&parameterMap.get("content").length > 0){
            cn.setContent(parameterMap.get("content")[0]);
        }
        return cn;
    }
}
