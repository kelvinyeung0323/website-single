package com.peacock.website.frontend.usercenter.mapper;

import com.peacock.website.frontend.usercenter.domain.UserAuth;
import com.peacock.website.frontend.usercenter.domain.UserAuthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAuthMapper {
    int countByExample(UserAuthExample example);

    int deleteByExample(UserAuthExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserAuth record);

    int insertSelective(UserAuth record);

    List<UserAuth> selectByExample(UserAuthExample example);

    UserAuth selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAuth record, @Param("example") UserAuthExample example);

    int updateByExample(@Param("record") UserAuth record, @Param("example") UserAuthExample example);

    int updateByPrimaryKeySelective(UserAuth record);

    int updateByPrimaryKey(UserAuth record);
}