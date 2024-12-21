package WeekendPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadDataFromProperty {
    public static void main(String[] args) throws IOException {
        System.out.println(readDataFromPropertyFile("platformName"));
        System.out.println(readDataFromPropertyFile("deviceName"));
    }
    public static String readDataFromPropertyFile(String key) throws IOException {
        Properties prop = new Properties();
            InputStream input = new FileInputStream(
                    "C:\\Users\\asus\\IdeaProjects\\AppiumBegin\\Config.properties");
            prop.load(input);
            return prop.getProperty(key);
    }
}
