package cn.cms.mapper;

import cn.cms.po.CmsStudent;
import cn.cms.po.CmsStudentExample;
import cn.cms.po.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsStudentMapper {
    long countByExample(CmsStudentExample example);

    int deleteByExample(CmsStudentExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(CmsStudent record);

    int insertSelective(CmsStudent record);

    List<CmsStudent> selectByExample(CmsStudentExample example);

    CmsStudent selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") CmsStudent record, @Param("example") CmsStudentExample example);

    int updateByExample(@Param("record") CmsStudent record, @Param("example") CmsStudentExample example);

    int updateByPrimaryKeySelective(CmsStudent record);

    int updateByPrimaryKey(CmsStudent record);

    List<CmsStudent> selectAllCmsStudent(Page page);
}