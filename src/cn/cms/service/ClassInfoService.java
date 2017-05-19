package cn.cms.service;


import cn.cms.po.ClassInfo;
import cn.cms.po.CmsStudent;
import cn.cms.po.Page;

import java.util.List;

public interface ClassInfoService {

    public List<ClassInfo> getClassInfoList(Page page);

    public void insert(ClassInfo record);

    public void delete(int id);

    public void update(ClassInfo record);

    public long count();
}
