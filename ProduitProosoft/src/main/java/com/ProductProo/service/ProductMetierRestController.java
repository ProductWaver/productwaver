package com.ProductProo.service;

import com.ProductProo.entities.Product_product;
import com.ProductProo.entities.Product_template;
import com.ProductProo.metier.CustomUserDetailsService;
import com.ProductProo.metier.ProductMetier;
import com.ProductProo.metier.ProductTemplateMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by amino on 20/11/2017
 */

@RestController
public class ProductMetierRestController {

    @Autowired
    private ProductMetier productMetier;

    @Autowired
    private ProductTemplateMetier productTemplateMetier;
    @RequestMapping(value = "/listProduct",method = RequestMethod.GET)
    public List<Product_product> ListProduct() {
        return productMetier.ListProduct();
    }

    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public void AddProduct(@RequestBody  Product_product product) {
        productMetier.AddProduct(product);
        //productTemplateMetier.AddProductTemplate(product_template);
    }
}
