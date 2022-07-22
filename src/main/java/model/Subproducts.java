package model;

import java.util.List;

public class Subproducts {
    private List<Subproduct>subproduct;

    public Subproducts(List<Subproduct> subproduct) {
        this.subproduct = subproduct;
    }

    public List<Subproduct> getSubproduct() {
        return subproduct;
    }

    public void setSubproduct(List<Subproduct> subproduct) {
        this.subproduct = subproduct;
    }

    @Override
    public String toString() {
        return "Subproducts{" +
                "subproduct=" + subproduct +
                '}';
    }
}
