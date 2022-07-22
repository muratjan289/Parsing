package model.Parser_of_BB;

import model.Images;
import model.Product;
import model.Subproducts;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

import static model.BBKonstant.*;

public class ParserProduct {

    public static Product parsProduct(Node productNode) {
         int code = 0;
         String ws_code = "";
         String barcode ="";
         String supplier_code="";
         String name ="";
         String cat1name="";
         int cat1code=0;
         String cat2name="";
         int  cat2code =0;
         String cat3name="";
         int cat3code =0;
         String category_path="";
         int stock =0;
         String unit="";

         double price_list =0;
         int price_list_campaign =0;
         float price_special_vat_included =0;
         double price_special =0;
         int price_special_rate =0;
         double price_credit_card =0;
         String currency="";
         int vat =0;
         String brand="";
         String model="";
         int desi =0;
         int width =0;
         int height =0;
          int deep =0;
         int weight =0;
         String detail="";
         String seo_title="";
         String seo_description="";
         String seo_keywords="";
         List <Images> images =null;
         List <Subproducts> subproducts = null;


         NodeList productChilds = productNode.getChildNodes();
         for (int j = 0; j < productChilds.getLength(); j++) {

              if (productChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                   continue;
              }
              switch (productChilds.item(j).getNodeName()) {
                   case TAG_CODE: {
                        code = Integer.parseInt(productChilds.item(j).getTextContent());
                        break;
                   }
                   case TAG_WS_CODE:{
                        ws_code = productChilds.item(j).getTextContent();
                   break;
                   }

              }
         }

              Product product = new Product(code, ws_code, barcode, supplier_code, name, cat1name, cat1code, cat2name, cat2code, cat3name, cat3code, category_path, stock, unit, price_list, price_list_campaign, price_special_vat_included, price_special, price_special_rate, price_credit_card, currency, vat, brand, model, desi, width, height, deep, width, detail, seo_title, seo_description, seo_keywords, images, subproducts);
              return product;

         }


}
