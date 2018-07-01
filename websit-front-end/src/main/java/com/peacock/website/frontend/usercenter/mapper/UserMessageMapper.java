package com.peacock.website.frontend.usercenter.mapper;

import com.peacock.website.frontend.usercenter.domain.UserMessage;
import com.peacock.website.frontend.usercenter.domain.UserMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMessageMapper {
    int countByExample(UserMessageExample example);

    int deleteByExample(UserMessageExample example);

    int deleteByPrimaryKey(String mid);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    List<UserMessage> selectByExampleWithBLOBs(UserMessageExample example);

    List<UserMessage> selectByExample(UserMessageExample example);

    UserMessage selectByPrimaryKey(String mid);

    int updateByExampleSelective(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExample(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKeyWithBLOBs(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}