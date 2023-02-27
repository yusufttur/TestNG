package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

public static Properties properties;

static {
    String path = "configuration.properties";
    try{
        FileInputStream fs = new FileInputStream(path);
        properties = new Properties();
        properties.load((fs));
    }catch (IOException e){
        e.printStackTrace();
    }
}
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
