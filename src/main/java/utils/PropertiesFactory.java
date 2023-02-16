package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesFactory {

    public static String getProperty(String name) {
        Properties prop = new Properties();
        try {
            prop.load(Files.newInputStream(Paths.get("src/main/resources/project.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(name);
    }
}
