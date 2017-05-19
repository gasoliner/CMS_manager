package cn.cms.servlet;

import cn.cms.po.Achievement;
import cn.cms.po.DataGrid;
import cn.cms.po.Page;
import cn.cms.service.AchievementService;
import cn.cms.service.impl.AchievementServiceImpl;
import cn.cms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class AchievementServlet extends HttpServlet {
    
    private AchievementService achievementService = new AchievementServiceImpl();

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
        achievementService.delete(Integer.parseInt(req.getParameter("aid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        achievementService.update(getObjectByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(achievementService.getList(page));
        dataGrid.setTotal(achievementService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String addtion(HttpServletRequest request){
        achievementService.insert(getObjectByRequest(request));
        return JSON.toJSONString("successful");
    }

    public Achievement getObjectByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        Achievement achievement = new Achievement();
        if (parameterMap.get("aid")!=null && parameterMap.get("aid").length > 0){
            achievement.setAid(Integer.parseInt(parameterMap.get("aid")[0]));
        }
        if (parameterMap.get("classs")!=null && parameterMap.get("classs").length > 0){
            achievement.setClasss(parameterMap.get("classs")[0]);
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            achievement.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("chinese")!=null &&parameterMap.get("chinese").length > 0){
            achievement.setChinese(Float.valueOf(parameterMap.get("chinese")[0]));
        }
        if (parameterMap.get("math")!=null && parameterMap.get("math").length > 0){
            achievement.setMath(Float.valueOf(parameterMap.get("math")[0]));
        }
        if (parameterMap.get("english")!=null && parameterMap.get("english").length > 0){
            achievement.setEnglish(Float.valueOf(parameterMap.get("english")[0]));
        }
        if (parameterMap.get("wuli")!=null &&parameterMap.get("wuli").length > 0){
            achievement.setWuli(Float.valueOf(parameterMap.get("wuli")[0]));
        }
        if (parameterMap.get("hauxue")!=null &&parameterMap.get("hauxue").length > 0){
            achievement.setHauxue(Float.valueOf(parameterMap.get("hauxue")[0]));
        }
        if (parameterMap.get("shengwu")!=null &&parameterMap.get("shengwu").length > 0){
            achievement.setShengwu(Float.valueOf(parameterMap.get("shengwu")[0]));
        }
        if (parameterMap.get("lishi")!=null &&parameterMap.get("lishi").length > 0){
            achievement.setLishi(Float.valueOf(parameterMap.get("lishi")[0]));
        }
        if (parameterMap.get("zhengzhi")!=null &&parameterMap.get("zhengzhi").length > 0){
            achievement.setZhengzhi(Float.valueOf(parameterMap.get("zhengzhi")[0]));
        }
        if (parameterMap.get("dili")!=null &&parameterMap.get("dili").length > 0){
            achievement.setDili(Float.valueOf(parameterMap.get("dili")[0]));
        }
        if (parameterMap.get("sum")!=null &&parameterMap.get("sum").length > 0){
            achievement.setSum(Float.valueOf(parameterMap.get("sum")[0]));
        }
        return achievement;
    }
}
