package com.sign_up.mapper;

import com.sign_up.pojo.SignUp;
import com.sign_up.pojo.SignUpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignUpMapper {
    int countByExample(SignUpExample example);

    int deleteByExample(SignUpExample example);

    int deleteByPrimaryKey(String signUpId);

    int insert(SignUp record);

    int insertSelective(SignUp record);

    List<SignUp> selectByExample(SignUpExample example);

    SignUp selectByPrimaryKey(String signUpId);

    int updateByExampleSelective(@Param("record") SignUp record, @Param("example") SignUpExample example);

    int updateByExample(@Param("record") SignUp record, @Param("example") SignUpExample example);

    int updateByPrimaryKeySelective(SignUp record);

    int updateByPrimaryKey(SignUp record);
}