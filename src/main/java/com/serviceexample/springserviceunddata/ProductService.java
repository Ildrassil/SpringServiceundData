package com.serviceexample.springserviceunddata;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public Product create(ProductCreate productCreate){
        Product product = new Product(
                productCreate.id(),
                productCreate.name(),
                productCreate.price(),
                System.currentTimeMillis()/1000
        );

        return productRepo.save(product);
    }

    public List<Product> getAll(){
        return productRepo.findAll();
    }
}
