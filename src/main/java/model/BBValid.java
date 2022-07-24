package model;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static model.BBKonstant.*;
import static model.Parser_of_BB.ParserProduct.parsProduct;

public class BBValid {

    public static void main(String[] args) {


        Products products = new Products();

        Document doca;
        try {
            doca = buildDocument();
        } catch (Exception e) {
            System.out.println("Open parsing error" + e.toString());
            return;
        }

        Node productsNode = doca.getFirstChild();
        NodeList productsChilds = productsNode.getChildNodes();


        Node productNode = null;
        Node imagesNode = null;

        for (int i = 0; i < productsChilds.getLength(); i++) {


            if (productsChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            switch (productsChilds.item(i).getNodeName()){
                case TAG_PRODUCT:{
                    productNode = productsChilds.item(i);
                    break;
                }
            }
        }
        if (productNode == null){
            return;
        }

        List<Product> productList = parsProduct(productNode);

        products.setProduct(productList);


        System.out.println(products.toString());

    }

    private static Document buildDocument()throws Exception{
        File file = new File("bb-valid.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return  dbf.newDocumentBuilder().parse(file);
    }

    private static List<Product> parsList(Node productNode){
        List <Product> productList  = new ArrayList<>();
        NodeList productChilds  = productNode.getChildNodes();

        for (int i = 0; i<productChilds.getLength(); i++){

            if (productChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            Product product = parsProduct(productChilds.item(i));
            productList.add(product);
        }
        return productList;
    }


}
