package com.serviceexample.springserviceunddata;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product post(@RequestBody ProductCreate productCreate) {
        return productService.create(productCreate);
    }


    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();

    }


}
