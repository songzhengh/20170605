package com.bwei.startz;

import com.bwei.util.PropertiesUtil;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @author songzhen
 * @create 2017-09-14 15:05
 */
public class JobMain {
    public static void main(String[] args) throws IOException {
        //①通过一个带@Configuration的POJO装载Bean配置
        ApplicationContext acxt=new AnnotationConfigApplicationContext(contextLoder.class);
        Properties properties= PropertiesUtil.getProperties("properties/log4j.properties","UTF-8");
        if (properties !=null){
            PropertyConfigurator.configure(properties);
        }
        new AnnotationConfigApplicationContext(JobMain.class);
    }
}
