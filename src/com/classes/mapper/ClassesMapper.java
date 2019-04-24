package com.classes.mapper;

import com.classes.pojo.Classes;
import com.classes.pojo.ClassesExample;
import com.common.utils.PageBean;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassesMapper {
    int countByExample(ClassesExample example);

    int deleteByExample(ClassesExample example);

    int deleteByPrimaryKey(Long classId);

    int insert(Classes record);

    int insertSelective(Classes record);

    List<Classes> selectByExampleWithBLOBs(ClassesExample example);

    List<Classes> selectByExample(ClassesExample example);

    Classes selectByPrimaryKey(Long classId);

    int updateByExampleSelective(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByExampleWithBLOBs(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByExample(@Param("record") Classes record, @Param("example") ClassesExample example);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKeyWithBLOBs(Classes record);

    int updateByPrimaryKey(Classes record);
    
    List<Classes> findAll(PageBean bean);
}