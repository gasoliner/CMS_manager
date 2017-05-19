package cn.cms.mapper;

import cn.cms.po.ClassNotice;
import cn.cms.po.ClassNoticeExample;
import cn.cms.po.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassNoticeMapper {
    long countByExample(ClassNoticeExample example);

    int deleteByExample(ClassNoticeExample example);

    int deleteByPrimaryKey(Integer cnid);

    int insert(ClassNotice record);

    int insertSelective(ClassNotice record);

    List<ClassNotice> selectByExample(ClassNoticeExample example);

    ClassNotice selectByPrimaryKey(Integer cnid);

    int updateByExampleSelective(@Param("record") ClassNotice record, @Param("example") ClassNoticeExample example);

    int updateByExample(@Param("record") ClassNotice record, @Param("example") ClassNoticeExample example);

    int updateByPrimaryKeySelective(ClassNotice record);

    int updateByPrimaryKey(ClassNotice record);

    List<ClassNotice> selectAll(Page page);
}