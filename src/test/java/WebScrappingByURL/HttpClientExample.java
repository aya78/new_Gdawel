package WebScrappingByURL;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.example.Main;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HttpClientExample {
    public static void main(String args[]) throws Exception {
        //Creating a HttpClient object
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //Creating a HttpGet object
        HttpGet httpget = new HttpGet("https://www.qoyod.com/ara/blog/");
        //Executing the Get request
        HttpResponse httpresponse = httpclient.execute(httpget);
        Scanner sc = new Scanner(httpresponse.getEntity().getContent());
        //Instantiating the StringBuffer class to hold the result
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(sc.next());
            //System.out.println(sc.next());
        }
        //Retrieving the String from the String Buffer object
        String result = sb.toString();
        System.out.println(result);

        //Removing the HTML tags
        result = result.replaceAll("<[^>]*>", "");
        System.out.println("Contents of the web page: " + result);
        Document doc = Jsoup.parse(result);
        // a[href]
        Elements links = doc.select("elementor-posts-container");
        for (Element link : links) {
            String href = link.attr("article");
            System.out.println(href);
        }
        Writer writer = new FileWriter("/home/hash-pc-8/new.csv", true);
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
        csvPrinter.printRecords(links);
//        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("links.csv"));
//             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
//
//             csvPrinter.printRecords(myList);
//        ) {
//            System.out.println("Done.");
////        for (int i = 0; i < serializer.toDO.size(); i++){
////            csvPrinter.printRecord(serializer.toDO.get(i).getTitle(),
////                    serializer.toDO.get(i).getDescription().replace("\n"," "),
////                    serializer.toDO.get(i).getPriority(),
////                    serializer.toDO.get(i).getLocalDate(),
////                    "toDo");
////        }
//        }   catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        Writer writer = Files.newBufferedWriter(Paths.get("links.csv"));
//        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);


    }
}