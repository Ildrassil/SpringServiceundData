package com.serviceexample.springserviceunddata;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String> {

}
