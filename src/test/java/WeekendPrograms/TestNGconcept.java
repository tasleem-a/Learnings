package WeekendPrograms;

import org.testng.annotations.*;

public class TestNGconcept {
    @BeforeSuite
    public void exeBeforeSuite(){
        System.out.println("Executed Before Suite");
    }
    @BeforeMethod
    public void exeBeforeMethod(){
        System.out.println("Executed Before Method");
    }

    @BeforeTest
    public  void beforeTest(){
        System.out.println("Executed before test");
    }
    @Test
    public void readData(){
        System.out.println("Executed test method");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Executed after test");
    }
    @AfterSuite
    public void exeAfterSuite(){
        System.out.println("Executed After Suite");
    }
    @AfterMethod
    public void exeAfterMethod(){
        System.out.println("Executed after Method");
    }


}
