package cn.cms.service;


import cn.cms.po.ClassFile;
import cn.cms.po.CmsTeacher;
import cn.cms.po.Page;

import java.util.List;

public interface PersonalService {

    public void update(CmsTeacher cmsTeacher);

    public boolean updatePassword(String newPassword1,String newPassword2,String oldPassword,int id);
}
