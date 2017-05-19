package cn.cms.service;


import cn.cms.po.ClassInfo;
import cn.cms.po.ClassNotice;
import cn.cms.po.Page;

import java.util.List;

public interface ClassNoticeService {

    public List<ClassNotice> getList(Page page);

    public void insert(ClassNotice record);

    public void delete(int id);

    public void update(ClassNotice record);

    public long count();
}
