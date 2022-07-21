package model2;



public class Item {
    private String label;
    private String brand;
    private String barcode;
    private String special_code;
    private double buyingPrice;
    private String categoryTree;

    private double price1;
    private double price2;
    private double price3;
    private double price4;
    private double price5;

    private double vendor_price_1;
    private double vendor_price_2;
    private double vendor_price_3;
    private double vendor_price_4;
    private double vendor_price_5;

    private double discounted_price;

    private double vendor_price_1_discounted;
    private double vendor_price_2_discounted;


    private double vendor_price_3_discounted;
    private double vendor_price_4_discounted;
    private double vendor_price_5_discounted;

    private int tax;

    private String currency;

    private String stockType;
    private String details;
    private  String simoleDetail;
    private int stockCode;
    private int stockAmount;
    private String picture1Path;
    private String picture2Path;
    private String metaDescription;
    private String color;
    private int width;
    private int height;
    private int depth;
    private int weight;
    private double deci;


    public Item(String label, String brand, String barcode, String special_code, double buyingPrice, String categoryTree, double price1, double price2, double price3, double price4, double price5, double vendor_price_1, double vendor_price_2, double vendor_price_3, double vendor_price_4, double vendor_price_5, double discounted_price, double vendor_price_1_discounted, double vendor_price_2_discounted, double vendor_price_3_discounted, double vendor_price_4_discounted, double vendor_price_5_discounted, int tax, String currency, String stock_Type, String details, String simoleDetail, int stockCode, int stockAmount, String picture1Path, String picture2Path, String metaDescription, String color, int width, int height, int depth, int weight, double deci) {
        this.label = label;
        this.brand = brand;
        this.barcode = barcode;
        this.special_code = special_code;
        this.buyingPrice = buyingPrice;
        this.categoryTree = categoryTree;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.price4 = price4;
        this.price5 = price5;
        this.vendor_price_1 = vendor_price_1;
        this.vendor_price_2 = vendor_price_2;
        this.vendor_price_3 = vendor_price_3;
        this.vendor_price_4 = vendor_price_4;
        this.vendor_price_5 = vendor_price_5;
        this.discounted_price = discounted_price;
        this.vendor_price_1_discounted = vendor_price_1_discounted;
        this.vendor_price_2_discounted = vendor_price_2_discounted;
        this.vendor_price_3_discounted = vendor_price_3_discounted;
        this.vendor_price_4_discounted = vendor_price_4_discounted;
        this.vendor_price_5_discounted = vendor_price_5_discounted;
        this.tax = tax;
        this.currency = currency;
        this.stockType = stock_Type;
        this.details = details;
        this.simoleDetail = simoleDetail;
        this.stockCode = stockCode;
        this.stockAmount = stockAmount;
        this.picture1Path = picture1Path;
        this.picture2Path = picture2Path;
        this.metaDescription = metaDescription;
        this.color = color;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.deci = deci;
    }

    public Item(String label, int stockCode) {
        this.label = label;
        this.stockCode = stockCode;
    }

    public Item() {

    }

    public String getLabel() {
        return label;
    }

    public String getBrand() {
        return brand;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getSpecial_code() {
        return special_code;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public String getCategoryTree() {
        return categoryTree;
    }

    public double getPrice1() {
        return price1;
    }

    public double getPrice2() {
        return price2;
    }

    public double getPrice3() {
        return price3;
    }

    public double getPrice4() {
        return price4;
    }

    public double getPrice5() {
        return price5;
    }

    public double getVendor_price_1() {
        return vendor_price_1;
    }

    public double getVendor_price_2() {
        return vendor_price_2;
    }

    public double getVendor_price_3() {
        return vendor_price_3;
    }

    public double getVendor_price_4() {
        return vendor_price_4;
    }

    public double getVendor_price_5() {
        return vendor_price_5;
    }

    public double getDiscounted_price() {
        return discounted_price;
    }

    public double getVendor_price_1_discounted() {
        return vendor_price_1_discounted;
    }

    public double getVendor_price_2_discounted() {
        return vendor_price_2_discounted;
    }

    public double getVendor_price_3_discounted() {
        return vendor_price_3_discounted;
    }

    public double getVendor_price_4_discounted() {
        return vendor_price_4_discounted;
    }

    public double getVendor_price_5_discounted() {
        return vendor_price_5_discounted;
    }

    public int getTax() {
        return tax;
    }

    public String getCurrency() {
        return currency;
    }

    public String getStock_Type() {
        return stockType;
    }

    public String getDetails() {
        return details;
    }

    public String getSimoleDetail() {
        return simoleDetail;
    }

    public int getStockCode() {
        return stockCode;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public String getPicture1Path() {
        return picture1Path;
    }

    public String getPicture2Path() {
        return picture2Path;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int getWeight() {
        return weight;
    }

    public double getDeci() {
        return deci;
    }

    @Override
    public String toString() {
        return "Item{" +
                "label='" + label + '\'' +
                ", brand='" + brand + '\'' +
                ", barcode='" + barcode + '\'' +
                ", special_code='" + special_code + '\'' +
                ", buyingPrice=" + buyingPrice +
                ", categoryTree='" + categoryTree + '\'' +
                ", price1=" + price1 +
                ", price2=" + price2 +
                ", price3=" + price3 +
                ", price4=" + price4 +
                ", price5=" + price5 +
                ", vendor_price_1=" + vendor_price_1 +
                ", vendor_price_2=" + vendor_price_2 +
                ", vendor_price_3=" + vendor_price_3 +
                ", vendor_price_4=" + vendor_price_4 +
                ", vendor_price_5=" + vendor_price_5 +
                ", discounted_price=" + discounted_price +
                ", vendor_price_1_discounted=" + vendor_price_1_discounted +
                ", vendor_price_2_discounted=" + vendor_price_2_discounted +
                ", vendor_price_3_discounted=" + vendor_price_3_discounted +
                ", vendor_price_4_discounted=" + vendor_price_4_discounted +
                ", vendor_price_5_discounted=" + vendor_price_5_discounted +
                ", tax=" + tax +
                ", currency=" + currency +
                ", stock_Type='" + stockType + '\'' +
                ", details='" + details + '\'' +
                ", simoleDetail='" + simoleDetail + '\'' +
                ", stockCode=" + stockCode +
                ", stockAmount=" + stockAmount +
                ", picture1Path='" + picture1Path + '\'' +
                ", picture2Path='" + picture2Path + '\'' +
                ", metaDescription='" + metaDescription + '\'' +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", weight=" + weight +
                ", deci=" + deci +
                '}';
    }

}
