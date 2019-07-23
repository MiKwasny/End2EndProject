package resourses;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCaseTemplate extends browserInitialization{

    String todaysDate = new SimpleDateFormat("ddMMyyyy").format(new Date());

    @BeforeTest
    public void initializeBrowser()throws IOException {

        driver = InitializeDriver();
        log.info(this.getClass().getSimpleName());
        log.info("Driver is initialized");
        driver.get("http://www.qaclickacademy.com/");
        log.info("Navigated to homepage");
    }
//    @Test
//    public void test()
//    {
//        testSource();
//    }

    @AfterTest
    public void teardown()
    {
        driver.close();
        log.info("~~~~~~~~Test Ended~~~~~~~~");
    }

    public void takeScreenShot(String result) throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\kwas0\\OneDrive\\Pulpit\\screenShotsSelenium\\screenshot"+result+".png"));
    }



//    public void testSource()
//    {
//        HashMap<Integer, Method> steps = new HashMap<>();
//        String regex = "^ste[[0-9]{1,$";
//        for (Method mth : getMethods()){
//            if(mth.getName().matches(regex)){
//                int step = Integer.parseInt(mth.getName().replace("step",""));
//                steps.putIfAbsent(step-1,mth);
//            }
//        }
//
//        stepsNumber = 0;
//        steps.forEach((id,xyz) -> {
//            stepsNumber = (stepsNumber>=(id+1))?stepsNumber:(id+1);
//        });
//
//        for (int i=0;i<stepsNumber;i++)
//        {
//            Method mth = steps.getOrDefault(i, null);
//            if(mth==null){
//                log.info("Step " +(i+1) + ". - Not Found");
//            }else
//            {
//                mth.setAccessible(true);
//                if(mth.isAnnotationPresent(Step.class)){
//                    Annotation annotation = mth.getAnnotation(Step.class);
//                    Step step = (Step) annotation;
//                    if(!step.hide()){
//                        if(!step.skip()){
//                            log.info("Step "+(i+1) + ". 0 "+step.description);
//                            runWithTimeout(mth);
//                            log.info("Step "+(i+1) + ". ok");
//                        }else
//                            log.info("cos tam");
//                    }
//                }else{
//                    runWithTimeout(mth);
//            }
//        }
//        }
//    }


}
