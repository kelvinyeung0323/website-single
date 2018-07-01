package com.peacock.website.frontend.sys.configuration.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 上午11:06 2018/7/1
 * @Modified By:
 **/
public class SysConfigurationHoler {
    private static Map<String,String>  sysConfigurationMap = new HashMap();

    public static String getString(String key){

        return sysConfigurationMap.get(key);
    }
    public static Integer getInteger(String key){
        return Integer.valueOf(sysConfigurationMap.get(key));
    }
    public static Boolean getBoolean(String key){
        String value = sysConfigurationMap.get(key);
        if(null==value
                && "".equals(sysConfigurationMap.get(key))){
            return null;
        }else if ("true".equals(value)){
            return true;
        }else{
            return false;
        }
    }
    public static String get(String key){
        return sysConfigurationMap.get(key);
    }

    public static void put(String key,String value){
        sysConfigurationMap.put(key,value);
    }
    public static void put(String key, Integer value){
        sysConfigurationMap.put(key,String.valueOf(value));
    }


    /*******************************************************
     * 常用参数
     *
     *
     * */


}
