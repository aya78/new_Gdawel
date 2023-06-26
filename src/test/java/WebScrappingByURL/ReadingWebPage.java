package WebScrappingByURL;

import org.openqa.selenium.By;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ReadingWebPage {
    static By product = By.xpath("//*[@id=\"product-data-table\"]/tbody/tr[1]");
    public static void main(String args[]) throws IOException {
        //Instantiating the URL class
        URL url = new URL("https://gdawel.app/dashboard/products");
        //Retrieving the contents of the specified page

        Scanner sc = new Scanner(url.openStream());
//        sc.useDelimiter("\\A");
//        Scanner c = new Scanner((Path) By.xpath("//*[@id=\"product-data-table\"]/tbody/tr[1]"));
        //Instantiating the StringBuffer class to hold the result
//        HTMLBodyElement  product = new HTMLBodyElement();

        StringBuffer sb = new StringBuffer();

//        sb.append(c.next());
            //System.out.println(sc.next());

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
    }
}
//        AbstractDocument.Content content= new AbstractDocument.Content() {
//            @Override
//            public Position createPosition(int offset) throws BadLocationException {
//                return null;
//            }
//
//            @Override
//            public int length() {
//                return 0;
//            }
//
//            @Override
//            public UndoableEdit insertString(int where, String str) throws BadLocationException {
//                return null;
//            }
//
//            @Override
//            public UndoableEdit remove(int where, int nitems) throws BadLocationException {
//                return null;
//            }
//
//            @Override
//            public String getString(int where, int len) throws BadLocationException {
//                return null;
//            }
//
//            @Override
//            public void getChars(int where, int len, Segment txt) throws BadLocationException {
//
//            }
//        }
