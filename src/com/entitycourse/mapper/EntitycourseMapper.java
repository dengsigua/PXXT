package com.entitycourse.mapper;

import com.common.utils.PageBean;
import com.entitycourse.pojo.Entitycourse;
import com.entitycourse.pojo.EntitycourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntitycourseMapper {
    int countByExample(EntitycourseExample example);

    int deleteByExample(EntitycourseExample example);

    int deleteByPrimaryKey(Long entitycourseId);

    int insert(Entitycourse record);

    int insertSelective(Entitycourse record);

    List<Entitycourse> selectByExample(EntitycourseExample example);

    Entitycourse selectByPrimaryKey(Long entitycourseId);

    int updateByExampleSelective(@Param("record") Entitycourse record, @Param("example") EntitycourseExample example);

    int updateByExample(@Param("record") Entitycourse record, @Param("example") EntitycourseExample example);

    int updateByPrimaryKeySelective(Entitycourse record);

    int updateByPrimaryKey(Entitycourse record);
    
    List<Entitycourse> findAll(PageBean bean);
}