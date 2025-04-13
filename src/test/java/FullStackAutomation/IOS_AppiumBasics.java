package FullStackAutomation;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class IOS_AppiumBasics extends IOS_BaseTest{

    @Test
    public void IOSFirstBasicTest(){

        driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
    }
}
