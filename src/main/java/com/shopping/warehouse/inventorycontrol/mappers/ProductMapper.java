package com.shopping.warehouse.inventorycontrol.mappers;

import com.shopping.warehouse.inventorycontrol.model.ProductDetail;
import com.shopping.warehouse.inventorycontrol.model.Product_title;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("SELECT * FROM product_title")
    List<Product_title> getProductList();

    @Select("select * from product_detail")
    List<ProductDetail> getProductDetailList();



}

