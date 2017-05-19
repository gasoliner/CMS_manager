package cn.cms.servlet;

import cn.cms.po.ClassFile;
import cn.cms.po.DataGrid;
import cn.cms.po.Page;
import cn.cms.service.ClassFileService;
import cn.cms.service.impl.ClassFileServiceImpl;
import cn.cms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class ClasssFileServlet extends HttpServlet {

    private ClassFileService classFileService = new ClassFileServiceImpl();

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
        }else if (requestName.equals("download")) {
            download(req,resp);
        } else {
            resp.getWriter().print(update(req));
        }
    }

    private void download(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        String filePath = classFileService.getFileById(Integer.parseInt(req.getParameter("cfid"))).getAnnex();
        resp.setContentType(getServletContext().getMimeType(filePath));
        resp.setHeader("Content-Disposition", "attachment;filename="+PageUtil.getFileNameByFilePath(filePath));
        System.out.println("fileName:\t"+PageUtil.getFileNameByFilePath(filePath));
        FileInputStream fileInputStream = new FileInputStream(filePath);
        OutputStream outputStream = resp.getOutputStream();
        int len ;
        byte[] bytes = new byte[1024*8];
        while ((len = fileInputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
            outputStream.flush();
        }
        fileInputStream.close();
        outputStream.close();
    }

    private String delete(HttpServletRequest req) {
        classFileService.delete(Integer.parseInt(req.getParameter("cfid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        classFileService.update(PageUtil.uploadFile(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(classFileService.getList(page));
        dataGrid.setTotal(classFileService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String addtion(HttpServletRequest request){
        classFileService.insert(PageUtil.uploadFile(request));
        return JSON.toJSONString("successful");
    }

}
