package cn.cms.servlet;

import cn.cms.po.CmsTeacher;
import cn.cms.service.PersonalService;
import cn.cms.service.impl.PersonalServiceImpl;
import cn.cms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class PersonalServlet extends HttpServlet {
    
private PersonalService personalService = new PersonalServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("update")){
            resp.getWriter().print(update(req));
        }else if (requestName.equals("password")){
            resp.getWriter().print(password(req));
        }
    }

    public String update(HttpServletRequest request){
        personalService.update(getObjByRequest(request));
        return JSON.toJSONString("successful");
    }

    private CmsTeacher getObjByRequest(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        CmsTeacher ct = new CmsTeacher();


        if (parameterMap.get("tid")!=null && parameterMap.get("tid").length > 0){
            ct.setTid(Integer.parseInt(parameterMap.get("tid")[0]));
        }
        if (parameterMap.get("employeenum")!=null && parameterMap.get("employeenum").length > 0){
            ct.setEmployeenum(Integer.valueOf(parameterMap.get("employeenum")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            ct.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("classs")!=null &&parameterMap.get("classs").length > 0){
            ct.setClasss(parameterMap.get("classs")[0]);
        }
        if (parameterMap.get("signature")!=null &&parameterMap.get("signature").length > 0){
            ct.setSignature(parameterMap.get("signature")[0]);
        }
        if (parameterMap.get("email")!=null &&parameterMap.get("email").length > 0){
            ct.setEmail(parameterMap.get("email")[0]);
        }
        if (parameterMap.get("phone")!=null &&parameterMap.get("phone").length > 0){
            ct.setPhone(parameterMap.get("phone")[0]);
        }
        return ct;
    }

    public String password(HttpServletRequest request){
        if (personalService.updatePassword(
                request.getParameter("newpassword1"),
                request.getParameter("newpassword2"),
                request.getParameter("oldpassword"),
                Integer.valueOf(request.getParameter("tid"))
        )){
            return JSON.toJSONString("successful");
        }else {
            return JSON.toJSONString("failed");
        }
    }

}
