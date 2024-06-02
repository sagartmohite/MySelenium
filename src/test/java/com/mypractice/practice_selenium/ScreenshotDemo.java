package com.mypractice.practice_selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemo
{
    @Test
    public void TestScreenshot() throws InterruptedException, IOException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File des = new File("C:\\Users\\sagar\\Documents\\Course\\screen\\seleniumPrograms.png");
        FileHandler.copy(src, des);

        driver.close();
    }

}
