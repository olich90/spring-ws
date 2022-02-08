package com.example.springws;

import com.example.api.product.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    public Product getProduct(String name) {
        Product product = new Product();
        product.setText("Запрошенный продукт " + name);
        product.setPrice(product.getPrice());
        return product;
    }
}
