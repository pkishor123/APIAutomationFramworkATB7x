package com.testingacademy.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

    public static String readKey(String key) {
        Properties properties = new Properties();
        // Legacy 1.2 JDK, - old
        try {
            // Read the data.properties and give the key -> value
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/data.properties");
            properties.load(fileInputStream);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return properties.getProperty(key);
    }

}
