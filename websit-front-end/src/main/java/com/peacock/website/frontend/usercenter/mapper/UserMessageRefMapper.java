package com.peacock.website.frontend.usercenter.mapper;

import com.peacock.website.frontend.usercenter.domain.UserMessageRef;
import com.peacock.website.frontend.usercenter.domain.UserMessageRefExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMessageRefMapper {
    int countByExample(UserMessageRefExample example);

    int deleteByExample(UserMessageRefExample example);

    int deleteByPrimaryKey(String uid);

    int insert(UserMessageRef record);

    int insertSelective(UserMessageRef record);

    List<UserMessageRef> selectByExample(UserMessageRefExample example);

    UserMessageRef selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") UserMessageRef record, @Param("example") UserMessageRefExample example);

    int updateByExample(@Param("record") UserMessageRef record, @Param("example") UserMessageRefExample example);

    int updateByPrimaryKeySelective(UserMessageRef record);

    int updateByPrimaryKey(UserMessageRef record);
}