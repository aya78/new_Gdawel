package purchase_and_return_invoice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

//import static jdk.javadoc.internal.doclets.formats.html.markup.TagName.I;

public class SuiteListener {


    public class Suite_Listener implements ITestListener {

        public static String imageName;

        @Override
        public void onTestFailure(ITestResult result) {
            String filename = "." + File.separator + "screenshots";
            File f = ((TakesScreenshot)  complete_purchase_invoice.driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(f, new File(filename + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            imageName = filename + ".png";
            String errorMessage = result.getThrowable().toString();
            try {
//                    SlackIncomingWebhook.slackWebhookPostRequest("slackIntegration",I.uploadImageToImgur(imageName),errorMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
