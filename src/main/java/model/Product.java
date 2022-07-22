package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Product<Product> implements List<Product> {
    private int code;
    private String ws_code;
    private String barcode;
    private String supplier_code;
    private String name;
    private String cat1name;
    private int cat1code;
    private String cat2name;
    private int  cat2code;
    private String cat3name;
    private int cat3code;
    private String category_path;
    private int stock;
    private String unit;

    private double price_list;
    private int price_list_campaign;
    private float price_special_vat_included;
    private double price_special;
    private int price_special_rate;
    private double price_credit_card;
    private String currency;
    private int vat;
    private String brand;
    private String model;
    private int desi;
    private int width;
    private int height;
    private  int deep;
    private int weight;
    private String detail;
    private String seo_title;
    private String seo_description;
    private String seo_keywords;
    private List<Images> images;
    private List <Subproducts> subproducts;


    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", ws_code='" + ws_code + '\'' +
                ", barcode='" + barcode + '\'' +
                ", supplier_code='" + supplier_code + '\'' +
                ", name='" + name + '\'' +
                ", cat1name='" + cat1name + '\'' +
                ", cat1code=" + cat1code +
                ", cat2name='" + cat2name + '\'' +
                ", cat2code=" + cat2code +
                ", cat3name='" + cat3name + '\'' +
                ", cat3code=" + cat3code +
                ", category_path='" + category_path + '\'' +
                ", stock=" + stock +
                ", unit='" + unit + '\'' +
                ", price_list=" + price_list +
                ", price_list_campaign=" + price_list_campaign +
                ", price_special_vat_included=" + price_special_vat_included +
                ", price_special=" + price_special +
                ", price_special_rate=" + price_special_rate +
                ", price_credit_card=" + price_credit_card +
                ", currency='" + currency + '\'' +
                ", vat=" + vat +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", desi=" + desi +
                ", width=" + width +
                ", height=" + height +
                ", deep=" + deep +
                ", weight=" + weight +
                ", detail='" + detail + '\'' +
                ", seo_title='" + seo_title + '\'' +
                ", seo_description='" + seo_description + '\'' +
                ", seo_keywords='" + seo_keywords + '\'' +
                ", images=" + images +
                ", subproducts=" + subproducts +
                '}';
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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCat1name() {
        return cat1name;
    }

    public void setCat1name(String cat1name) {
        this.cat1name = cat1name;
    }

    public int getCat1code() {
        return cat1code;
    }

    public void setCat1code(int cat1code) {
        this.cat1code = cat1code;
    }

    public String getCat2name() {
        return cat2name;
    }

    public void setCat2name(String cat2name) {
        this.cat2name = cat2name;
    }

    public int getCat2code() {
        return cat2code;
    }

    public void setCat2code(int cat2code) {
        this.cat2code = cat2code;
    }

    public String getCat3name() {
        return cat3name;
    }

    public void setCat3name(String cat3name) {
        this.cat3name = cat3name;
    }

    public int getCat3code() {
        return cat3code;
    }

    public void setCat3code(int cat3code) {
        this.cat3code = cat3code;
    }

    public String getCategory_path() {
        return category_path;
    }

    public void setCategory_path(String category_path) {
        this.category_path = category_path;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice_list() {
        return price_list;
    }

    public void setPrice_list(double price_list) {
        this.price_list = price_list;
    }

    public int getPrice_list_campaign() {
        return price_list_campaign;
    }

    public void setPrice_list_campaign(int price_list_campaign) {
        this.price_list_campaign = price_list_campaign;
    }

    public float getPrice_special_vat_included() {
        return price_special_vat_included;
    }

    public void setPrice_special_vat_included(float price_special_vat_included) {
        this.price_special_vat_included = price_special_vat_included;
    }

    public double getPrice_special() {
        return price_special;
    }

    public void setPrice_special(double price_special) {
        this.price_special = price_special;
    }

    public int getPrice_special_rate() {
        return price_special_rate;
    }

    public void setPrice_special_rate(int price_special_rate) {
        this.price_special_rate = price_special_rate;
    }

    public double getPrice_credit_card() {
        return price_credit_card;
    }

    public void setPrice_credit_card(double price_credit_card) {
        this.price_credit_card = price_credit_card;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDesi() {
        return desi;
    }

    public void setDesi(int desi) {
        this.desi = desi;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSeo_title() {
        return seo_title;
    }

    public void setSeo_title(String seo_title) {
        this.seo_title = seo_title;
    }

    public String getSeo_description() {
        return seo_description;
    }

    public void setSeo_description(String seo_description) {
        this.seo_description = seo_description;
    }

    public String getSeo_keywords() {
        return seo_keywords;
    }

    public void setSeo_keywords(String seo_keywords) {
        this.seo_keywords = seo_keywords;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public List<Subproducts> getSubproducts() {
        return subproducts;
    }

    public void setSubproducts(List<Subproducts> subproducts) {
        this.subproducts = subproducts;
    }

    public Product(int code, String ws_code, String barcode, String supplier_code, String name, String cat1name, int cat1code, String cat2name, int cat2code, String cat3name, int cat3code, String category_path, int stock, String unit, double price_list, int price_list_campaign, float price_special_vat_included, double price_special, int price_special_rate, double price_credit_card, String currency, int vat, String brand, String model, int desi, int width, int height, int deep, int weight, String detail, String seo_title, String seo_description, String seo_keywords, List<Images> images, List<Subproducts> subproducts) {
        this.code = code;
        this.ws_code = ws_code;
        this.barcode = barcode;
        this.supplier_code = supplier_code;
        this.name = name;
        this.cat1name = cat1name;
        this.cat1code = cat1code;
        this.cat2name = cat2name;
        this.cat2code = cat2code;
        this.cat3name = cat3name;
        this.cat3code = cat3code;
        this.category_path = category_path;
        this.stock = stock;
        this.unit = unit;
        this.price_list = price_list;
        this.price_list_campaign = price_list_campaign;
        this.price_special_vat_included = price_special_vat_included;
        this.price_special = price_special;
        this.price_special_rate = price_special_rate;
        this.price_credit_card = price_credit_card;
        this.currency = currency;
        this.vat = vat;
        this.brand = brand;
        this.model = model;
        this.desi = desi;
        this.width = width;
        this.height = height;
        this.deep = deep;
        this.weight = weight;
        this.detail = detail;
        this.seo_title = seo_title;
        this.seo_description = seo_description;
        this.seo_keywords = seo_keywords;
        this.images = images;
        this.subproducts = subproducts;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Product get(int index) {
        return null;
    }

    @Override
    public Product set(int index, Product element) {
        return null;
    }

    @Override
    public void add(int index, Product element) {

    }

    @Override
    public Product remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Product> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Product> listIterator(int index) {
        return null;
    }

    @Override
    public List<Product> subList(int fromIndex, int toIndex) {
        return null;
    }
}