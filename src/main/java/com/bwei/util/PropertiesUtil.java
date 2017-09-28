package com.bwei.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

/**
 * Created by songzhen on 2017/9/1.
 */
public class PropertiesUtil {
    public static Properties getProperties(String filePath, String character) throws IOException {
        Properties prop = new Properties();
        Reader reader=null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath);
            reader = new InputStreamReader(inputStream,character);
            prop.load(reader);
            inputStream.close(); //关闭流
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
