package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    Creating a private constructor, so we are closing access to the object of this class from outside the class
     */
    private Driver(){}

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();


        /*
        We make WebDriver private, because we want to close access from outside the class.
        We make it static because we will use it on a static method.
         */
//        private static WebDriver driver; // value is null by default

        /*
        Create a re-usable utility method which will return same driver instance when we call it
         */
        public static WebDriver getDriver(){

            // it will check if driver is null and if it is we will set up browser inside if statement
            // if you already set up driver and using it again for following line of code, it will return to same driver
            if(driverPool.get() == null){

                /*
                We read our BrowserType from config.properties file
                This way, we can control which browser is opened from outside our code, from config.properties
                 */
                String browserType = ConfigurationReader.getProperty("browser");

                /*
                Depending on the browserType that will be return from config.properties file
                switch statement will determine the case, and open the matching browser
                 */

                switch (browserType){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                        break;
                }

            }

            return driverPool.get();
        }

        /*
        This method will make sure our driver value is always null after using quit() method
         */
        public static void closeDriver(){
            if (driverPool.get() != null){
                driverPool.get().quit();
                driverPool.remove();
            }
        }
    }

