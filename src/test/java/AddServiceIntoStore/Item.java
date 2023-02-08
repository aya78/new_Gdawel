package AddServiceIntoStore;


 import java.math.BigDecimal;

/**class2**/
public class Item {
    //    public static final String baseURL = "https://www.amazon.sa/-/en/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2";
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
