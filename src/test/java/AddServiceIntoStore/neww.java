package AddServiceIntoStore;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.gargoylesoftware.htmlunit.WebClient;
//import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
//import com.gargoylesoftware.htmlunit.html.HtmlElement;
//import com.gargoylesoftware.htmlunit.html.HtmlListItem;
//import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.List;

/** class1
 * import java.math.BigDecimal;

 public class Item {
 private String title ;
 private BigDecimal price ;
 private String url ;

 public String getTitle() {
 return title;
 }
 public void setTitle(String title) {
 this.title = title;
 }
 public BigDecimal getPrice() {

 return price;
 }
 public void setPrice(BigDecimal price) {
 this.price = price;
 }
 public String getUrl() {
 return url;
 }
 public void setUrl(String url) {
 this.url = url;
 }
 }
 * **/
/**class2**/
public class neww {
    //    public static final String baseURL = "https://www.amazon.sa/-/en/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2";

    public static void main(String[] args) {

//        WebClient client = new WebClient();
//        client.getOptions().setJavaScriptEnabled(false);
//        client.getOptions().setCssEnabled(false);
//        client.getOptions().setUseInsecureSSL(true);
        //    try{
//        HtmlPage page= client.getPage(baseURL);
////        System.out.println(page.asXml());
////        List<HtmlElement> items =page.getByXPath("//*[@id=\"zg_left_colleft\"]");
//        List<HtmlElement> items =page.getByXPath("//*[@id=\"zg_left_col1\"]/div[1]");
//
//        if(items.isEmpty())
//        {
//            System.out.println("no item found ");
//        }
//        else {
//            for (HtmlElement htmlElement : items){
//                HtmlAnchor itemAanchor =(HtmlAnchor) htmlElement.getFirstByXPath("//*[@id=\"B08HKC3C95\"]/a[2]");
//                // //*[@id="B08HKC3C95"]/div[1]/span/div
//                HtmlElement div_company = (HtmlElement) htmlElement.getFirstByXPath("//*[@id=\"B08HKC3C95\"]/div[1]/span/div");
//
//                HtmlElement spanPrice = (HtmlElement) htmlElement.getFirstByXPath("//*[@id=\"B08HKC3C95\"]/div[4]/div/div/a/div/span/span");
//                String itemPrice = spanPrice == null ? "0.0": spanPrice.asNormalizedText();
//                Item item1 = new Item();
//                item1.setTitle(itemAanchor.asNormalizedText());
//                item1.setUrl(itemAanchor.getHrefAttribute());
////                item1.setTitle(div_company.asNormalizedText());
////              item.setPrice(new BigDecimal(itemPrice.replace("6","")));
//                ObjectMapper mapper = new ObjectMapper();
//                String jsonString = mapper.writeValueAsString(item1);
//                System.out.println(jsonString);
//
//            }
//        }
//        catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
