package cn.cms.service.impl;

import cn.cms.mapper.ClassInfoMapper;
import cn.cms.po.ClassInfo;
import cn.cms.po.ClassInfo;
import cn.cms.po.ClassInfoExample;
import cn.cms.po.Page;
import cn.cms.service.ClassInfoService;
import cn.cms.service.UserService;
import cn.cms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class ClassInfoServiceImpl implements ClassInfoService {


    @Override
    public List<ClassInfo> getClassInfoList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassInfoMapper cmsClassInfoMapper = sqlSession.getMapper(ClassInfoMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<ClassInfo> classInfoList = cmsClassInfoMapper.selectAllClassInfo(page);
        sqlSession.close();
        return classInfoList;
    }

    @Override
    public void insert(ClassInfo record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassInfoMapper classInfoMapper = sqlSession.getMapper(ClassInfoMapper.class);
        classInfoMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassInfoMapper classInfoMapper = sqlSession.getMapper(ClassInfoMapper.class);
        classInfoMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(ClassInfo record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassInfoMapper classInfoMapper = sqlSession.getMapper(ClassInfoMapper.class);
        classInfoMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassInfoMapper classInfoMapper = sqlSession.getMapper(ClassInfoMapper.class);
        long count = classInfoMapper.countByExample(new ClassInfoExample());
        sqlSession.close();
        return count;
    }
}
