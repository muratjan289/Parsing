package model.Parser_of_BB;

import model.Subproducts;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

import static model.BBKonstant.*;

public class Parser_of_Subproduct {



    public static List<Subproducts> parsSubproducts(Node subproductsNode){
        List <Subproducts> subproductsList = new ArrayList<>();
        NodeList subroductsChilds = subproductsNode.getChildNodes();
        for (int i = 0; i<subroductsChilds.getLength();i++){
            if(subroductsChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            if(!subroductsChilds.item(i).getNodeName().equals(TAG_SUBPRODUCT)){
                continue;
            }

            NodeList subproductChild = subroductsChilds.item(i).getChildNodes();

            Subproducts subproducts = parseSubproduct(subroductsChilds.item(i));
            subproductsList.add(subproducts);
        }
        return subproductsList;
    }

    public static Subproducts parseSubproduct(Node subproductNode) {

        int VaryantGroupID = 0;
        int code = 0;
        String ws_code = "";
        String type1 = "";
        String type2 = "";
        String barcode = "";
        int stock = 0;
        double desi = 0;
        double price_list = 0;
        double price_list_discount = 0;
        double price_special = 0;
        String supplier_code = "";


        NodeList subproductChilds = subproductNode.getChildNodes();
        for (int j = 0; j < subproductChilds.getLength(); j++) {

            if (subproductChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (subproductChilds.item(j).getNodeName()) {
                case TAG_VARYANT_GROUP_ID: {
                    VaryantGroupID = Integer.parseInt(subproductChilds.item(j).getTextContent());
                    break;
                }
                case TAG_S_CODE: {
                    code = Integer.parseInt(subproductChilds.item(j).getTextContent());
                    break;
                }
                case TAG_S_WS_CODE: {
                    ws_code = subproductChilds.item(j).getTextContent();
                    break;
                }
                case TAG_TYPE_1: {
                    type1 = subproductChilds.item(j).getTextContent();
                    break;
                }
                case TAG_TYPE_2: {
                    type2 = subproductChilds.item(j).getTextContent();
                    break;
                }
                case TAG_S_BARCODE: {
                    barcode = subproductChilds.item(j).getTextContent();
                    break;
                }
                case TAG_S_STOCK: {
                    stock = Integer.parseInt(subproductChilds.item(j).getTextContent());
                    break;
                }
                case TAG_S_DESI: {
                    desi = Integer.parseInt(subproductChilds.item(j).getTextContent());
                    break;
                }
                case TAG_S_PRICE_LIST: {
                    price_list = Double.parseDouble(subproductChilds.item(j).getTextContent());
                    break;
                }
                case TAG_S_PRICE_LIST_DISCOUNT: {
                    price_list_discount = Double.parseDouble(subproductChilds.item(j).getTextContent());
                    break;
                }
                case TAG_S_PRICE_SPECIAL: {
                    price_special = Double.parseDouble(subproductChilds.item(j).getTextContent());
                    break;
                }
                case TAG_S_SUPPLIER_CODE:{
                    supplier_code = subproductChilds.item(j).getTextContent();
                    break;
                }

            }
        }
            Subproducts subproducts = new Subproducts(VaryantGroupID, code, ws_code, type1, type2, barcode, stock, desi, price_list, price_list_discount, price_special, supplier_code);
            return subproducts;

        }

}
