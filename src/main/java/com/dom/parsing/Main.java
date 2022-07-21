package com.dom.parsing;

import model2.Item;
import model2.Root;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static model2.Constants.*;
import static model2.Parser.parseItem;


public class Main {



    public static void main(String[] args) {


        Root root = new Root();


        Document doc;
        try {
            doc = buildDocument();
        } catch (Exception e) {
            System.out.println("Open parsing Error" + e.toString());
            return;
        }

        Node rootNode = doc.getFirstChild();
        NodeList rootChilds = rootNode.getChildNodes();

        Node itemNode = null;

        for (int i = 0; i < rootChilds.getLength(); i++) {

            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            switch (rootChilds.item(i).getNodeName()) {
                case TAG_ITEM: {
                    itemNode = rootChilds.item(i);
                    break;

                }
            }
        }
        if (itemNode == null) {
            return;
        }

        List<Item> itemList = parsList(itemNode);

        root.setItem(itemList);

        System.out.println("Root" + root.toString());
    }

    private static Document buildDocument() throws Exception {
        File file = new File("ews-valid.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);

    }

    private static List<Item> parsList(Node itemNode) {
        List<Item> itemList = new ArrayList<>();
        NodeList itemChilds = itemNode.getChildNodes();
        for (int i = 0; i < itemChilds.getLength(); i++) {
            if (itemChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }


            Item item = parseItem(itemChilds.item(i));
            itemList.add(item);
        }
        return itemList;
    }


}
