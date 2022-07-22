package model.Parser_of_BB;

import model.Images;
import org.w3c.dom.Node;

public class Parser_of_Images {

    public static Images parseImages(Node imagesNode) {
     String img_item = "";

    Images images = new Images(img_item);
    return images;
    }
}
