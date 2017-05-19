package cn.cms.service.impl;

import cn.cms.mapper.ClassFileMapper;
import cn.cms.po.ClassFile;
import cn.cms.po.ClassFileExample;
import cn.cms.po.Page;
import cn.cms.service.ClassFileService;
import cn.cms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class ClassFileServiceImpl implements ClassFileService {


    @Override
    public List<ClassFile> getList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassFileMapper classFileMapper = sqlSession.getMapper(ClassFileMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<ClassFile> classFileList = classFileMapper.selectAll(page);
        sqlSession.close();
        for (ClassFile classFile:
                classFileList){
            classFile.setAction("<a target=\"_blank\" href=\"/classsFile/download?cfid="+classFile.getCfid()+"\">下载并查看</a>");
        }
        return classFileList;
    }

    @Override
    public void insert(ClassFile record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassFileMapper classFileMapper = sqlSession.getMapper(ClassFileMapper.class);
        classFileMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassFileMapper classFileMapper = sqlSession.getMapper(ClassFileMapper.class);
        classFileMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(ClassFile record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassFileMapper classFileMapper = sqlSession.getMapper(ClassFileMapper.class);
        classFileMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassFileMapper classFileMapper = sqlSession.getMapper(ClassFileMapper.class);
        long count = classFileMapper.countByExample(new ClassFileExample());
        sqlSession.close();
        return count;
    }

    @Override
    public ClassFile getFileById(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassFileMapper classFileMapper = sqlSession.getMapper(ClassFileMapper.class);
        ClassFile classFile = classFileMapper.selectByPrimaryKey(id);
        sqlSession.close();
        return classFile;
    }
}
