package cn.cms.service.impl;

import cn.cms.mapper.CmsStudentMapper;
import cn.cms.mapper.CmsTeacherMapper;
import cn.cms.po.CmsStudent;
import cn.cms.po.CmsStudentExample;
import cn.cms.po.CmsTeacher;
import cn.cms.po.Page;
import cn.cms.service.UserService;
import cn.cms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class UserServiceImpl implements UserService {


    @Override
    public List<CmsStudent> getCmsStudentList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        CmsStudentMapper CmsCmsStudentMapper = sqlSession.getMapper(CmsStudentMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<CmsStudent> CmsStudentList = CmsCmsStudentMapper.selectAllCmsStudent(page);
        sqlSession.close();
        return CmsStudentList;   
    }

    @Override
    public void insert(CmsStudent record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        CmsStudentMapper cmsStudentMapper = sqlSession.getMapper(CmsStudentMapper.class);
        cmsStudentMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int sid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        CmsStudentMapper cmsStudentMapper = sqlSession.getMapper(CmsStudentMapper.class);
        cmsStudentMapper.deleteByPrimaryKey(sid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(CmsStudent record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        CmsStudentMapper cmsStudentMapper = sqlSession.getMapper(CmsStudentMapper.class);
        cmsStudentMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        CmsStudentMapper cmsStudentMapper = sqlSession.getMapper(CmsStudentMapper.class);
        long count = cmsStudentMapper.countByExample(new CmsStudentExample());
        sqlSession.close();
        return count;
    }

    @Override
    public CmsTeacher getTeacherByEmployeenum(int employeenum) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        CmsTeacherMapper cmsTeacherMapper = sqlSession.getMapper(CmsTeacherMapper.class);
        CmsTeacher cmsTeacher = cmsTeacherMapper.selectByEmployeenum(employeenum);
        return cmsTeacher;
    }
}
