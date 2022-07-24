package model.Parser_of_BB;

import model.Images;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

import static model.BBKonstant.TAG_IMG_ITEM;

public class Parser_of_Images {



    private static List<Images> parsImages(Node imagesNode){
        List <Images> imagesList  = new ArrayList<>();
        NodeList imagesChilds  = imagesNode.getChildNodes();

        for (int i = 0; i<imagesChilds.getLength(); i++){

            if (imagesChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            Images images = parseImages(imagesChilds.item(i));
            imagesList.add(images);
        }
        return imagesList;
    }

    public static Images parseImages(Node imagesNode) {
     String img_item = "";
        NodeList imagesChilds = imagesNode.getChildNodes();


        for(int j = 0; j < imagesChilds.getLength(); j++) {

            if (imagesChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (imagesChilds.item(j).getNodeName()) {
                case TAG_IMG_ITEM: {
                    img_item = imagesChilds.item(j).getTextContent();
                    break;
                }
    }
}
        Images images = new Images(img_item);
        return images;
    }
}
