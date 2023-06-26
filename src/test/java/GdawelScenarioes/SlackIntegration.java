package GdawelScenarioes;
//
//import com.github.seratch.jslack.Slack;
//import com.github.seratch.jslack.api.webhook.WebhookResponse;
//import org.apache.hc.client5.http.classic.methods.HttpPost;
//import org.apache.hc.client5.http.entity.mime.FileBody;
//import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
//import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
//import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
//import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
//import org.apache.http.HttpEntity;
//import org.apache.http.entity.mime.HttpMultipartMode;
//import org.testng.annotations.Optional;
//import org.testng.annotations.Test;
//import org.xml.sax.SAXException;
//
//import javax.swing.text.Document;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.File;
//import java.io.IOException;
//import java.net.http.HttpClient;
//import java.net.http.HttpResponse;
//
//public class SlackIntegration {
//    public class Slack_Integration {
//        private static String SlackWebHook = "YOUR_WEBHOOK_URL";
//        private static String channelName = "YOUR_SLACK_CHANNEL_NAME";
//        private static String botUserOAuthAccessToken = " OAuth_TOKEN";
//
//        @Test
//        public void TestStatusToSlack(String message) throws Exception {
//
//            try {
////Make sure testng.xml location should be correct
//                String path = System.getProperty("user.dir") + "/test-output/testng-results.xml";
//                File testNgResultXmlFile = new File(path);
//
////Get Document Builder
//                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//                DocumentBuilder builder = null;
//                try {
//                    builder = factory.newDocumentBuilder();
//                } catch (ParserConfigurationException e) {
//                    e.printStackTrace();
//                }
//
////Build Document
//                Document document = null;
//                try {
//                    document = (Document) builder.parse(testNgResultXmlFile);
//                } catch (SAXException e) {
//                    e.printStackTrace();
//                }
//
////Normalize the XML Structure;
//                ((org.w3c.dom.Document) document).getDocumentElement().normalize();
//
////Fetch TestNG Results from XML;
//                String totaltest = ((org.w3c.dom.Document) document).getDocumentElement().getAttribute("total");
//                String passed = ((org.w3c.dom.Document) document).getDocumentElement().getAttribute("passed");
//                String failed = ((org.w3c.dom.Document) document).getDocumentElement().getAttribute("failed");
//                String skipped = ((org.w3c.dom.Document) document).getDocumentElement().getAttribute("skipped");
//
//                StringBuilder messageBuider = new StringBuilder();
//
//                messageBuider.append(methodname + "========================" + "\n\n" + "Total Number of Test Cases: " + totaltest + "\n\n" + "Passed Test Cases: " + passed + "\n\n" + "Failed Test Cases: " + failed + "\n\n" + "Skipped Test Cases: " + skipped);
//                WebhookResponse webhookResponse = Slack.getInstance().send(SlackWebHook,
//                        payload);
//                webhookResponse.getMessage();
//            } catch (IOException e) {
//                System.out.println("Unexpected Error! WebHook:" + SlackWebHook);
//            }
//
//            @Test
//            public void ReportToSlack ( @Optional("testReportPath")
//                            String testReportPath){
//                String url = "https://slack.com/api/files.upload?token=" + botUserOAuthAccessToken + "&channels=" + channelName + " ";
//                try {
//                    CloseableHttpClient httpclient = HttpClientBuilder.create().build();
//                    HttpPost httppost = new HttpPost(url);
//                    MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//                    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
//                    FileBody fileBody = new FileBody(new File(testReportPath));
//                    builder.addPart("file", fileBody);
//                    httppost.setEntity(builder.build());
//                    CloseableHttpResponse response = null;
//                    response = httpclient.execute(httppost);
//                    HttpEntity result = ((CloseableHttpResponse) response).getEntity();
//                    System.out.println(result.toString());
//                } catch (Exception e) {
//                    // TODO: handle exception
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
