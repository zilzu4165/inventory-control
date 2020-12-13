package com.shopping.warehouse.inventorycontrol.service.lmpl;

import com.shopping.warehouse.inventorycontrol.mappers.ProductMapper;
import com.shopping.warehouse.inventorycontrol.model.ProductDetail;
import com.shopping.warehouse.inventorycontrol.model.Product_title;
import com.shopping.warehouse.inventorycontrol.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicelmpl implements ProductService {

    @Autowired
    private ProductMapper dao;

    @Override
    public List<Product_title> printProduct() {
        List<Product_title> product_titles = dao.getProductList();
        return product_titles;
    }

    public List<ProductDetail> printDetail() {
        List<ProductDetail> details = dao.getProductDetailList();
        return details;
    }

}
