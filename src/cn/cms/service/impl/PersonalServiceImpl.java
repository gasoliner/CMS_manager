package cn.cms.service.impl;

import cn.cms.mapper.CmsTeacherMapper;
import cn.cms.po.CmsTeacher;
import cn.cms.service.PersonalService;
import cn.cms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;


public class PersonalServiceImpl implements PersonalService {

    @Override
    public void update(CmsTeacher cmsTeacher) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        CmsTeacherMapper cmsTeacherMapper = sqlSession.getMapper(CmsTeacherMapper.class);
        cmsTeacherMapper.updateByPrimaryKeySelective(cmsTeacher);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public boolean updatePassword(String newPassword1,String newPassword2,String oldPassword,int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        CmsTeacherMapper cmsTeacherMapper = sqlSession.getMapper(CmsTeacherMapper.class);
        if (cmsTeacherMapper.selectByPrimaryKey(id).getPassword().equals(oldPassword)){
            if (newPassword1.equals(newPassword2)){
                CmsTeacher cmsTeacher = new CmsTeacher();
                cmsTeacher.setPassword(newPassword1);
                cmsTeacher.setTid(id);
                cmsTeacherMapper.updateByPrimaryKeySelective(cmsTeacher);
                sqlSession.commit();
                sqlSession.close();
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
