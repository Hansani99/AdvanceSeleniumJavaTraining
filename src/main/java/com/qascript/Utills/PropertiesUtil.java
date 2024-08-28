package com.qascript.Utills;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties properties = new Properties();
    static FileInputStream fis;


    public static Properties loadApplicationProperties() {

        try {
            fis= new FileInputStream("src/test/resources/config/application.Properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return properties;
    }
    public static Properties loadFrameworkProperties() {

        try {
            fis = new FileInputStream("src/test/resources/config/framework.Properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return properties;
    }

    public static Properties loadUserProperties() {

        try {
            fis = new FileInputStream("src/test/resources/config/user.Properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return properties;
    }
    }