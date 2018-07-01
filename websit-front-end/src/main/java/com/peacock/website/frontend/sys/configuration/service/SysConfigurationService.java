package com.peacock.website.frontend.sys.configuration.service;

import com.peacock.website.frontend.sys.configuration.domain.SysConfiguration;
import com.peacock.website.frontend.sys.configuration.domain.SysConfigurationExample;
import com.peacock.website.frontend.sys.configuration.domain.SysConfigurationHoler;
import com.peacock.website.frontend.sys.configuration.mapper.SysConfigurationMapper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 上午10:58 2018/7/1
 * @Modified By:
 **/
public class SysConfigurationService {

    @Autowired
    SysConfigurationMapper sysConfigurationMapper;

    /**
     * 更新系统设置
     * 系统设置更新到数据库，同时保存到缓存
     * @param sysConfiguration
     */
    public void updateConfiguration(SysConfiguration sysConfiguration){
            //TODO:验证
        sysConfigurationMapper.updateByPrimaryKey(sysConfiguration);

    }

    /**
     * 返回SysConfigurationHolder对像
     * @return
     */
    public List<SysConfiguration> getConfiguration(Map<String,Object> params){
           String module = (String) params.get("module");
           String key = (String) params.get("key");
           SysConfigurationExample example = new SysConfigurationExample();
           SysConfigurationExample.Criteria criteria =example.createCriteria();
           if(StringUtils.isNotBlank(module)){
               criteria.andModuleEqualTo(module);
           }
           if(StringUtils.isNotBlank(key)){
               criteria.andKeyEqualTo(key);
           }

           List<SysConfiguration> sysConfigurationList = sysConfigurationMapper.selectByExample(example);
           return sysConfigurationList;
    }

    public void initConfigurationHoler(){
        SysConfigurationExample sysConfigurationExample = new SysConfigurationExample();
        List<SysConfiguration> sysConfigurationList = sysConfigurationMapper.selectByExample(sysConfigurationExample);
        for(SysConfiguration sysConfig:sysConfigurationList){
            String key = sysConfig.getModule() + "." + sysConfig.getKey();
            SysConfigurationHoler.put(key,sysConfig.getValue());
        }

    }

    public String get(String key){

        return "";
    }

    public String getString(String key){

        return "";
    }
    public Integer getInteger(String key){
        return 0;
    }
}
