package com.ProductProo.metier;


import com.ProductProo.entities.Product_product;

import java.util.List;

/**
 * Created by amino on 20/11/2017
 */

public interface ProductMetier {
    public List<Product_product> ListProduct();
    public Product_product AddProduct(Product_product product);
}
