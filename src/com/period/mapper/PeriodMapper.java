package com.period.mapper;

import com.common.utils.PageBean;
import com.period.pojo.Period;
import com.period.pojo.PeriodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeriodMapper {
    int countByExample(PeriodExample example);

    int deleteByExample(PeriodExample example);

    int deleteByPrimaryKey(Integer periodId);

    int insert(Period record);

    int insertSelective(Period record);

    List<Period> selectByExample(PeriodExample example);

    Period selectByPrimaryKey(Integer periodId);

    int updateByExampleSelective(@Param("record") Period record, @Param("example") PeriodExample example);

    int updateByExample(@Param("record") Period record, @Param("example") PeriodExample example);

    int updateByPrimaryKeySelective(Period record);

    int updateByPrimaryKey(Period record);
    
    List<Period> findAll(PageBean bean);
}