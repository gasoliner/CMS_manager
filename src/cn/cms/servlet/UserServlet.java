package cn.cms.servlet;

import cn.cms.po.CmsStudent;
import cn.cms.po.CmsTeacher;
import cn.cms.po.DataGrid;
import cn.cms.po.Page;
import cn.cms.service.UserService;
import cn.cms.service.impl.UserServiceImpl;
import cn.cms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class UserServlet extends HttpServlet {
    
    private UserService userService = new UserServiceImpl();

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
        }else if (requestName.equals("update")){
            resp.getWriter().print(update(req));
        }else if (requestName.equals("signin")){
            resp.getWriter().print(signin(req));
        }else if (requestName.equals("signout")){
            resp.getWriter().print(signout(req));
        }
    }

    private String signout(HttpServletRequest req) {
        req.getSession().invalidate();
        return null;
    }

    private String signin(HttpServletRequest req) throws IOException {
        int employeenum = Integer.parseInt(req.getParameter("employeenum"));
        String password = req.getParameter("password");
        CmsTeacher teacher = userService.getTeacherByEmployeenum(employeenum);
        if (teacher != null && teacher.getPassword().equals(password)){
                req.getSession().setAttribute("id",teacher.getTid());
                req.getSession().setAttribute("user",teacher.getUsername());
                return "/UI/index";
        }else {
                return "/UI/sign";
        }
    }


    private String delete(HttpServletRequest req) {
        userService.delete(Integer.parseInt(req.getParameter("sid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        userService.update(getStudentByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(userService.getCmsStudentList(page));
        dataGrid.setTotal(userService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String addtion(HttpServletRequest request){
        userService.insert(getStudentByRequest(request));
        return JSON.toJSONString("successful");
    }

    public CmsStudent getStudentByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        CmsStudent cs = new CmsStudent();
        if (parameterMap.get("sid")!=null && parameterMap.get("sid").length > 0){
            cs.setSid(Integer.parseInt(parameterMap.get("sid")[0]));
        }
        if (parameterMap.get("number")!=null && parameterMap.get("number").length > 0){
            cs.setNumber(Long.parseLong(parameterMap.get("number")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            cs.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("sex")!=null &&parameterMap.get("sex").length > 0){
            cs.setSex(parameterMap.get("sex")[0]);
        }
        if (parameterMap.get("classs")!=null &&parameterMap.get("classs").length > 0){
            cs.setClasss(parameterMap.get("classs")[0]);
        }
        if (parameterMap.get("signature")!=null &&parameterMap.get("signature").length > 0){
            cs.setSignature(parameterMap.get("signature")[0]);
        }
        if (parameterMap.get("email")!=null &&parameterMap.get("email").length > 0){
            cs.setEmail(parameterMap.get("email")[0]);
        }
        if (parameterMap.get("phone")!=null &&parameterMap.get("phone").length > 0){
            cs.setPhone(parameterMap.get("phone")[0]);
        }
        return cs;
    }
}
