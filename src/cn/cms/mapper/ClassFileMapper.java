package cn.cms.mapper;

import cn.cms.po.ClassFile;
import cn.cms.po.ClassFileExample;
import cn.cms.po.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassFileMapper {
    long countByExample(ClassFileExample example);

    int deleteByExample(ClassFileExample example);

    int deleteByPrimaryKey(Integer cfid);

    int insert(ClassFile record);

    int insertSelective(ClassFile record);

    List<ClassFile> selectByExample(ClassFileExample example);

    ClassFile selectByPrimaryKey(Integer cfid);

    int updateByExampleSelective(@Param("record") ClassFile record, @Param("example") ClassFileExample example);

    int updateByExample(@Param("record") ClassFile record, @Param("example") ClassFileExample example);

    int updateByPrimaryKeySelective(ClassFile record);

    int updateByPrimaryKey(ClassFile record);

    List<ClassFile> selectAll(Page page);
}