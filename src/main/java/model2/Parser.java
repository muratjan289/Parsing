package model2;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static model2.Constants.*;


public class Parser {
    public static Item parseItem(Node itemNode) {
        String label = "";
        String brand = "";
        String barcode = "";
        String special_code="";
        double buyingPrice=0;
        String categoryTree ="";
        double price1=0;
        double price2=0;
        double price3=0;
        double price4=0;
        double price5=0;
        double vendor_price_1 = 0;
        double vendor_price_2 = 0;
        double vendor_price_3 = 0;
        double vendor_price_4 = 0;
        double vendor_price_5 = 0;
        double discounted_price= 0;
        double vendor_price_1_discounted= 0;
        double vendor_price_2_discounted= 0;
        double vendor_price_3_discounted= 0;
        double vendor_price_4_discounted= 0;
        double vendor_price_5_discounted= 0;
        int tax= 0;
        String currency = "";
        String stockType= "";
        String details= "";
        String simoleDetail= "";
        int stockCode= 0;
        int stockAmount = 0;
        String picture1Path= "";
        String picture2Path= "";
        String metaDescription= "";
        String color= "";
        int width= 0;
        int height =0 ;
        int depth = 0;
        int weight = 0;
        double deci = 0;


        NodeList itemChilds = itemNode.getChildNodes();

        for (int j = 0; j < itemChilds.getLength(); j++) {
            if (itemChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (itemChilds.item(j).getNodeName()) {
                case TAG_LABEL: {
                    label = itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_BRAND: {
                    brand = itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_BARCODE: {
                    barcode = itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_SPECIAL_CODE: {
                    special_code = itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_BUYING_PRICE: {
                    buyingPrice = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_CATEGORY_TREE: {
                    categoryTree = itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_PRICE1: {
                    price1 = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }

                case TAG_PRICE2: {
                    price2 =  Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }

                case TAG_PRICE3: {
                    price3 =  Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_PRICE4: {
                    price4 = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_PRICE5: {
                    price5 = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE1: {
                    vendor_price_1 = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE2: {
                    vendor_price_2 = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE3: {
                    vendor_price_3 = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE4: {
                    vendor_price_4 = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE5: {
                    vendor_price_5 = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_DISCOUNTED_PRICE: {
                    discounted_price = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE_1_DISCOUNTED: {
                    vendor_price_1_discounted = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE_2_DISCOUNTED: {
                    vendor_price_2_discounted = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE_3_DISCOUNTED: {
                    vendor_price_3_discounted = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE_4_DISCOUNTED: {
                    vendor_price_4_discounted = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_VENDOR_PRICE_5_DISCOUNTED: {
                    vendor_price_5_discounted = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_TAX: {
                    tax = Integer.valueOf(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_CURRENCY: {
                    currency =  itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_STOCK_TYPE: {
                    stockType =  itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_DETAILS: {
                    details =  itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_SIMPLE_DETAIL: {
                    simoleDetail =  itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_STOCK_CODE: {
                    stockCode = Integer.parseInt(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_STOCK_AMOUNT: {
                    stockAmount = Integer.parseInt(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_PICTURE1_PATH: {
                    picture1Path =  itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_PICTURE2_PATH: {
                    picture2Path =  itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_META_DESCRIPTION: {
                    metaDescription =  itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_COLOR: {
                    color =  itemChilds.item(j).getTextContent();
                    break;
                }
                case TAG_WIDTH: {
                    width = Integer.parseInt(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_HEIGHT: {
                    height = Integer.parseInt(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_DEPTH: {
                    depth = Integer.parseInt(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_WEIGHT: {
                    weight = Integer.parseInt(itemChilds.item(j).getTextContent());
                    break;
                }
                case TAG_DECI: {
                    deci = Double.parseDouble(itemChilds.item(j).getTextContent());
                    break;
                }
            }
        }
        Item item = new Item(label,brand,barcode,special_code,buyingPrice,categoryTree,price1,price2,price3,price4,price5,vendor_price_1,vendor_price_2,vendor_price_3,vendor_price_4,vendor_price_5,discounted_price,vendor_price_1_discounted,vendor_price_2_discounted,vendor_price_3_discounted,vendor_price_4_discounted,vendor_price_5_discounted,tax,currency,stockType,details,simoleDetail,stockCode,stockAmount,picture1Path,picture2Path,metaDescription,color,width,height,depth,weight,deci);
        return item;
    }
}
