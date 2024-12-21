package com.appium.automationsuite.Libraries;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.*;
import java.util.Properties;


public class GenericLibraray{
    public AndroidDriver driver;
    public static String sTestData="";
    public static  String[] toReadExcelData(String sSheet, String sTestcaseID) throws IOException {
       String[] sData=null;
        FileInputStream fis=new FileInputStream(" ");
        Workbook wb= WorkbookFactory.create(fis);
        Sheet st=wb.getSheet(sSheet);
        int rowNum=st.getLastRowNum();
        for(int i=1;i<=rowNum;i++){
            if(st.getRow(i).getCell(0).toString().equals(sTestcaseID)){
                int cellNum=st.getRow(i).getLastCellNum();
                sData=new String[cellNum];
                for(int j=0;j<=cellNum;j++){
                    sData[j]=st.getRow(i).getCell(j).getStringCellValue();
                }
                break;
            }
        }
        return sData;
    }
    public static String getPropertyFileData(String pFile, String key) throws IOException {
        Properties prop=new Properties();
        FileInputStream propFile=new FileInputStream(pFile);
        prop.load(propFile);
        return   prop.getProperty(key);
    }
    public static String getVisibileAreaScreenshot(AndroidDriver driver,String SreenshotName) throws IOException {
        TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        String dest=System.getProperty("user.dir")+"//VisibleViewScreenShot//"+SreenshotName+".png";
        FileUtils.copyFile(source, new File(dest));
        return "";
    }
    public static void swipeToAGivenTextAndClick(String elementText) {
        String uiSelector = "new UiSelector().textMatches(\"" + elementText
                + "\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                + uiSelector + ");";
        BaseLibrary.driver.findElement(AppiumBy.androidUIAutomator(command)).click();
    }
}
