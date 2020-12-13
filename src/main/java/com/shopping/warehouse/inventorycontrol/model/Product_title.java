package com.shopping.warehouse.inventorycontrol.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString //
 public class Product_title {
    private String product_code;
    private String make_factory;
    private int unit_price;
    private String final_update;
    private int make_code;

}
