package com.shopping.warehouse.inventorycontrol.model;


import lombok.Data;

@Data
public class ProductDetail {

    private String product_code;
    private String color_name;
    private String gender;
    private int s;
    private int m;
    private int l;
    private int xl;
    private int f;
    private int total;
    private String manufacture_day;

}
