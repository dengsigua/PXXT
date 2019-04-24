package com.cat.mapper;

import com.cat.pojo.ClassCat;
import com.cat.pojo.ClassCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassCatMapper {
    int countByExample(ClassCatExample example);

    int deleteByExample(ClassCatExample example);

    int deleteByPrimaryKey(Long classCatId);

    int insert(ClassCat record);

    int insertSelective(ClassCat record);

    List<ClassCat> selectByExample(ClassCatExample example);

    ClassCat selectByPrimaryKey(Long classCatId);

    int updateByExampleSelective(@Param("record") ClassCat record, @Param("example") ClassCatExample example);

    int updateByExample(@Param("record") ClassCat record, @Param("example") ClassCatExample example);

    int updateByPrimaryKeySelective(ClassCat record);

    int updateByPrimaryKey(ClassCat record);
}