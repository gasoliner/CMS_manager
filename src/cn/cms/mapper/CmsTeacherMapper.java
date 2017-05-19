package cn.cms.mapper;

import cn.cms.po.CmsTeacher;
import cn.cms.po.CmsTeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsTeacherMapper {
    long countByExample(CmsTeacherExample example);

    int deleteByExample(CmsTeacherExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(CmsTeacher record);

    int insertSelective(CmsTeacher record);

    List<CmsTeacher> selectByExample(CmsTeacherExample example);

    CmsTeacher selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") CmsTeacher record, @Param("example") CmsTeacherExample example);

    int updateByExample(@Param("record") CmsTeacher record, @Param("example") CmsTeacherExample example);

    int updateByPrimaryKeySelective(CmsTeacher record);

    int updateByPrimaryKey(CmsTeacher record);

    CmsTeacher selectByEmployeenum(int employeenum);
}