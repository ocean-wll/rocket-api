package com.github.alenfive.rocketapi.function;

import com.github.alenfive.rocketapi.extend.ApiInfoContent;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:日志输出
 * @Copyright: Copyright (c) 2019  ALL RIGHTS RESERVED.
 * @Author: 米华军
 * @CreateDate: 2020/6/23 17:58
 * @UpdateDate: 2020/6/23 17:58
 * @UpdateRemark: init
 * @Version: 1.0
 */
@Component
@Slf4j
public class LogFunction implements IFunction{

    @Autowired
    private ApiInfoContent apiInfoContent;

    @Override
    public String getVarName() {
        return "log";
    }

    public void info(Object format,Object ... args){
        log.info(format.toString(),args);
        apiInfoContent.putLog("info:"+ MessageFormatter.arrayFormat(format.toString(), args).getMessage());
    }

    public void debug(Object format,Object ... args){
        log.debug(format.toString(),args);
        apiInfoContent.putLog("debug: "+ MessageFormatter.arrayFormat(format.toString(), args).getMessage());
    }

    public void error(Object format,Object ... args){
        log.error(format.toString(),args);
        apiInfoContent.putLog("error: "+ MessageFormatter.arrayFormat(format.toString(), args).getMessage());
    }

    public void warn(Object format,Object ... args){
        log.warn(format.toString(),args);
        apiInfoContent.putLog("warn: "+ MessageFormatter.arrayFormat(format.toString(), args).getMessage());
    }

    public void trace(Object format,Object ... args){
        log.trace(format.toString(),args);
        apiInfoContent.putLog("trace: "+ MessageFormatter.arrayFormat(format.toString(), args).getMessage());
    }
}