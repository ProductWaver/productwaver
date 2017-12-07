package com.ProductProo.metier;

import com.ProductProo.dao.Product_productRepository;
import com.ProductProo.entities.Product_product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by amino on 20/11/2017
 */

@Service
public class ProductMetierImpl implements ProductMetier {

    @Autowired
    private Product_productRepository product_productRepository;

    @Override
    public List<Product_product> ListProduct() {
        return product_productRepository.findAll();
    }

    @Override
    public Product_product AddProduct(Product_product product) {
        return product_productRepository.save(product);
    }
}
