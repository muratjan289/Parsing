package model2;

import java.util.List;

public class Root {
    private List <Item> item;

    public Root() {

    }


    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Root(List<Item> item) {
        this.item = item;
    }

    public List<Item> getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Root{" +
                "item=" + item +
                '}';
    }
}
