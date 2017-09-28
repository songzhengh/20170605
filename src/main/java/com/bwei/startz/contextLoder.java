package com.bwei.startz;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ${DESCRIPTION}
 *
 * @author songzhen
 * @create 2017-09-14 13:48
 */
@Configuration("jobconfig")
@EnableTransactionManagement
@ComponentScan("com.bwei")
@ImportResource("classpath:/spring/spring-dao.xml")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class contextLoder {

}
