package com.bwei.startz;

import com.bwei.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * ${DESCRIPTION}
 *
 * @author songzhen
 * @create 2017-09-14 15:26
 */
@Service("addJob")
@EnableScheduling
@PropertySource("classpath:properties/jobconfig.properties")
public class AddJob {
    private Logger log=Logger.getLogger("log");
    @Autowired
    private IUserService userService;

    @Scheduled(cron = "${addJob}")
    public void run(){
        long time = System.currentTimeMillis();
        log.info("----------------开始添加用户信息");
        log.info("本次共删除用户数量为："+String.valueOf(userService.addUser()));
        log.info("----------------插入用户信息结束，耗时："+(System.currentTimeMillis()-time));
    }
}
