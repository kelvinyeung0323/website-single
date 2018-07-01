package com.peacock.website.frontend.sys.configuration.mapper;

import com.peacock.website.frontend.sys.configuration.domain.SysConfiguration;
import com.peacock.website.frontend.sys.configuration.domain.SysConfigurationExample;
import com.peacock.website.frontend.sys.configuration.domain.SysConfigurationKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysConfigurationMapper {
    int countByExample(SysConfigurationExample example);

    int deleteByExample(SysConfigurationExample example);

    int deleteByPrimaryKey(SysConfigurationKey key);

    int insert(SysConfiguration record);

    int insertSelective(SysConfiguration record);

    List<SysConfiguration> selectByExample(SysConfigurationExample example);

    SysConfiguration selectByPrimaryKey(SysConfigurationKey key);

    int updateByExampleSelective(@Param("record") SysConfiguration record, @Param("example") SysConfigurationExample example);

    int updateByExample(@Param("record") SysConfiguration record, @Param("example") SysConfigurationExample example);

    int updateByPrimaryKeySelective(SysConfiguration record);

    int updateByPrimaryKey(SysConfiguration record);
}