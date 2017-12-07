package com.ProductProo.metier;

import com.ProductProo.dao.ProductTemplateRepository;
import com.ProductProo.entities.Product_template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by amino on 26/11/2017
 */
@Service
public class ProductTemplateMetierImpl implements ProductTemplateMetier {

    @Autowired
    private ProductTemplateRepository productTemplateRepository;

    @Override
    public Product_template AddProductTemplate(Product_template product_template) {
        return productTemplateRepository.save(product_template);
    }
}
