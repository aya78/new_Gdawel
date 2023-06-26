package WebScrappingByURL;

import java.io.IOException;

import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;

public class JsoupExample {
        public static void main(String args[]) throws IOException {

            String webPage = "https://gdawel.app/dashboard/products";

            String html = Jsoup.connect(webPage).get().html();
//            String body = Jsoup.connect(webPage).request().requestBody();
            System.out.println(html);
        }
//    String result = doc.body().text();

//    public static void main(String args[]) throws IOException {
//        String page = "http://www.something.com/";
//        //Connecting to the web page
//        Connection conn = Jsoup.connect(page);
//        //executing the get request
//        Document doc = (Document) conn.get();
//        //Retrieving the contents (body) of the web page
//        String result = doc.body().text();
//        System.out.println(result);
//    }
}