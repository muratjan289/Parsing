package model.Parser_of_BB;

import model.Subproduct;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Parser_of_Subproduct {

    public static Subproduct parseSubproduct(Node subproductNode) {

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
        double price_special = 0l;
        String supplier_code = "";


        NodeList subproductChilds = subproductNode.getChildNodes();
        for (int j = 0; j < subproductChilds.getLength(); j++) {

            if (subproductChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
        }
            Subproduct subproduct = new Subproduct(VaryantGroupID, code, ws_code, type1, type2, barcode, stock, desi, price_list, price_list_discount, price_special, supplier_code);
            return subproduct;

        }

}
