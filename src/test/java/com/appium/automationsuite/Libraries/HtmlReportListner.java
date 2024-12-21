package com.appium.automationsuite.Libraries;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HtmlReportListner implements ITestListener{
    public static ExtentReports extent;
    public static ExtentTest test;
    public static ExtentHtmlReporter htmlReporter;

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass(MarkupHelper.createLabel(result.getName()+"has Passed", ExtentColor.GREEN));
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(MarkupHelper.createLabel(result.getName()+"has failed due to following issues", ExtentColor.RED));
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss");
        String sDate=sdf.format(date);
        htmlReporter=new ExtentHtmlReporter(new File(BaseLibrary.sDirPath+"\\Reports"+sDate+"HtmlReporter.html"));
        extent=new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("AuthorName","Tasleem");
        extent.setSystemInfo("BuildName","1.0");
    }

    @Override
    public void onFinish(ITestContext context) {
      extent.flush();
    }
}
