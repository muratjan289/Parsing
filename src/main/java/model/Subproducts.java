package model;

import java.util.List;

public class Subproducts {
    private List<Subproducts>subproducts;

    public Subproducts(List<Subproducts> subproducts) {
        this.subproducts = subproducts;
    }

    public Subproducts(int varyantGroupID, int code, String ws_code, String type1, String type2, String barcode, int stock, double desi, double price_list, double price_list_discount, double price_special, String supplier_code) {
    }

    public List<Subproducts> getSubproducts() {
        return subproducts;
    }

    public void setSubproducts(List<Subproducts> subproducts) {
        this.subproducts = subproducts;
    }

    @Override
    public String toString() {
        return "Subproducts{" +
                "subproduct=" + subproducts +
                '}';
    }

}
