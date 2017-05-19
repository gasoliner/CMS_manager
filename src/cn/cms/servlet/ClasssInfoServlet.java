package cn.cms.servlet;

import cn.cms.po.ClassInfo;
import cn.cms.po.CmsStudent;
import cn.cms.po.DataGrid;
import cn.cms.po.Page;
import cn.cms.service.ClassInfoService;
import cn.cms.service.impl.ClassInfoServiceImpl;
import cn.cms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class ClasssInfoServlet extends HttpServlet {
    
    private ClassInfoService classInfoService = new ClassInfoServiceImpl();

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
        classInfoService.delete(Integer.parseInt(req.getParameter("ciid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        classInfoService.update(getClassInfoByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(classInfoService.getClassInfoList(page));
        dataGrid.setTotal(classInfoService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String addtion(HttpServletRequest request){
        classInfoService.insert(getClassInfoByRequest(request));
        return JSON.toJSONString("successful");
    }

    public ClassInfo getClassInfoByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        ClassInfo ci = new ClassInfo();
        if (parameterMap.get("ciid")!=null && parameterMap.get("ciid").length > 0){
            ci.setCiid(Integer.parseInt(parameterMap.get("ciid")[0]));
        }
        if (parameterMap.get("classs")!=null && parameterMap.get("classs").length > 0){
            ci.setClasss(parameterMap.get("classs")[0]);
        }
        if (parameterMap.get("countpeople")!=null &&parameterMap.get("countpeople").length > 0){
            ci.setCountpeople(Integer.valueOf(parameterMap.get("countpeople")[0]));
        }
        if (parameterMap.get("info")!=null &&parameterMap.get("info").length > 0){
            ci.setInfo(parameterMap.get("info")[0]);
        }
        if (parameterMap.get("teacher")!=null &&parameterMap.get("teacher").length > 0){
            ci.setTeacher(parameterMap.get("teacher")[0]);
        }
        return ci;
    }
}
