package cn.cms.service.impl;

import cn.cms.mapper.ClassNoticeMapper;
import cn.cms.po.*;
import cn.cms.service.ClassNoticeService;
import cn.cms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class ClassNoticeServiceImpl implements ClassNoticeService {


    @Override
    public List<ClassNotice> getList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassNoticeMapper classNoticeMapper = sqlSession.getMapper(ClassNoticeMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<ClassNotice> classNoticeList = classNoticeMapper.selectAll(page);
        sqlSession.close();
        return classNoticeList;
    }

    @Override
    public void insert(ClassNotice record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassNoticeMapper classNoticeMapper = sqlSession.getMapper(ClassNoticeMapper.class);
        classNoticeMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassNoticeMapper classNoticeMapper = sqlSession.getMapper(ClassNoticeMapper.class);
        classNoticeMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(ClassNotice record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassNoticeMapper classNoticeMapper = sqlSession.getMapper(ClassNoticeMapper.class);
        classNoticeMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ClassNoticeMapper classNoticeMapper = sqlSession.getMapper(ClassNoticeMapper.class);
        long count = classNoticeMapper.countByExample(new ClassNoticeExample());
        sqlSession.close();
        return count;
    }
}
