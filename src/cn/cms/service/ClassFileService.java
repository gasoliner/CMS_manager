package cn.cms.service;


import cn.cms.po.ClassFile;
import cn.cms.po.Page;

import java.util.List;

public interface ClassFileService {

    public List<ClassFile> getList(Page page);

    public void insert(ClassFile record);

    public void delete(int id);

    public void update(ClassFile record);

    public long count();

    public ClassFile getFileById(int id);
}
