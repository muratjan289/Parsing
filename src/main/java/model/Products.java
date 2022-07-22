package model;

import java.util.List;

public class Products {

    private List<Product> product;

    public Products(List<Product> product) {
        this.product = product;
    }

    public Products() {

    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product=" + product +
                '}';
    }
}
