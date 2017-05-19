package cn.cms.service;


import cn.cms.po.CmsStudent;
import cn.cms.po.CmsTeacher;
import cn.cms.po.Page;

import java.util.List;

public interface UserService {

    public List<CmsStudent> getCmsStudentList(Page page);

    public void insert(CmsStudent record);

    public void delete(int sid);

    public void update(CmsStudent record);

    public long count();

    public CmsTeacher getTeacherByEmployeenum(int employeenum);
}
