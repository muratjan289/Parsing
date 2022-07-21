package model;

import java.util.Currency;
import java.util.List;

public class Product {
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
     private Currency currency;
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



}
