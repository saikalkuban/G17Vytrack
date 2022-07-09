package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // 1 - create properties object
    // we make this private to be inaccessible from outside
    // we will use this object under static method
    private static Properties properties = new Properties();

    // make static because static runs first and before everything else
    static {

        try {

            // create FileInputStream object to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("config.properties");

            // load "properties object with the "file" we opened using FileInputStream"
            properties.load(file);
            file = new FileInputStream("config.properties");
            file.close();
        } catch (IOException e) {
            System.out.println("Error occurred while reading configuration file");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){

        // we can use properties.getProperty method to read from the file we loaded.(configuration.properties)
        return properties.getProperty(key);
    }
}
