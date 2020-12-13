package com.shopping.warehouse.inventorycontrol.service;

import com.shopping.warehouse.inventorycontrol.model.ProductDetail;
import com.shopping.warehouse.inventorycontrol.model.Product_title;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product_title> printProduct();
    List<ProductDetail> printDetail();
}
