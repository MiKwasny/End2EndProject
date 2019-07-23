package resourses;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.util.Calendar;

import static resourses.browserInitialization.log;

public class listeners implements ITestListener {

    TestCaseTemplate tCaseTem = new TestCaseTemplate();

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        log.info("~~~~ Test Success ~~~~");
        try {
            tCaseTem.takeScreenShot(result.getName()+tCaseTem.todaysDate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.info("~~~~ Test Failure ~~~~");
        try {

            tCaseTem.takeScreenShot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
