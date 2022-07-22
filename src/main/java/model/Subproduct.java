package model;

public class Subproduct {

    private int VaryantGroupID;
    private int code;
    private String ws_code;
    private String type1;
    private String type2;
    private String barcode;
    private int stock;
    private double desi;
    private double price_list;
    private double price_list_discount;
    private double price_special;
    private String supplier_code;

    public Subproduct(int varyantGroupID, int code, String ws_code, String type1, String type2, String barcode, int stock, double desi, double price_list, double price_list_discount, double price_special, String supplier_code) {
        VaryantGroupID = varyantGroupID;
        this.code = code;
        this.ws_code = ws_code;
        this.type1 = type1;
        this.type2 = type2;
        this.barcode = barcode;
        this.stock = stock;
        this.desi = desi;
        this.price_list = price_list;
        this.price_list_discount = price_list_discount;
        this.price_special = price_special;
        this.supplier_code = supplier_code;
    }

    public int getVaryantGroupID() {
        return VaryantGroupID;
    }

    public void setVaryantGroupID(int varyantGroupID) {
        VaryantGroupID = varyantGroupID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getWs_code() {
        return ws_code;
    }

    public void setWs_code(String ws_code) {
        this.ws_code = ws_code;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getDesi() {
        return desi;
    }

    public void setDesi(double desi) {
        this.desi = desi;
    }

    public double getPrice_list() {
        return price_list;
    }

    public void setPrice_list(double price_list) {
        this.price_list = price_list;
    }

    public double getPrice_list_discount() {
        return price_list_discount;
    }

    public void setPrice_list_discount(double price_list_discount) {
        this.price_list_discount = price_list_discount;
    }

    public double getPrice_special() {
        return price_special;
    }

    public void setPrice_special(double price_special) {
        this.price_special = price_special;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    @Override
    public String toString() {
        return "Subproduct{" +
                "VaryantGroupID=" + VaryantGroupID +
                ", code=" + code +
                ", ws_code='" + ws_code + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", barcode='" + barcode + '\'' +
                ", stock=" + stock +
                ", desi=" + desi +
                ", price_list=" + price_list +
                ", price_list_discount=" + price_list_discount +
                ", price_special=" + price_special +
                ", supplier_code='" + supplier_code + '\'' +
                '}';
    }
}
