package com.shopping.warehouse.inventorycontrol.controller;
import com.shopping.warehouse.inventorycontrol.model.ProductDetail;
import com.shopping.warehouse.inventorycontrol.model.Product_title;
import com.shopping.warehouse.inventorycontrol.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/list")
    public String list(Model model) {
        List<Product_title> product_titles = productService.printProduct();
        System.out.println(product_titles);
        model.addAttribute("ProductList", product_titles);
        return "home"; // home.html 반환 하겠다
    }
    @GetMapping("listdetail")
    public String Listdetail(Model model) {
        List<ProductDetail> details = productService.printDetail();
        System.out.println(details);
        model.addAttribute("ProductDetail", details);
        return "detail";
    }
}
