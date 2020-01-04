package com.example.onetomanytest.service;

import com.example.onetomanytest.domain.Category;
import com.example.onetomanytest.domain.Product;
import com.example.onetomanytest.repository.CategoryRespository;
import com.example.onetomanytest.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class IDatabaseImpl implements IDataBase {
    private final CategoryRespository categoryRespository;
    private final ProductRepository productRepository;

    public  IDatabaseImpl(CategoryRespository categoryRespository, ProductRepository productRepository){
        this.categoryRespository = categoryRespository;
        this.productRepository = productRepository;
    }


    @Override
    public void createDataBase() {
        Category c1 = new Category();
        c1.setName("Fruit");

        Category c2 = new Category();
        c2.setName("Meat");

        Product p1 = new Product("Apple",23,2000);
        Product p2 = new Product("Orange",33,1000);
        Product p3 = new Product("Fish",43,2050);
        Product p4 = new Product("Chicken",43,2500);

        c1.getProducts().add(p1);
        c1.getProducts().add(p2);

        c2.getProducts().add(p3);
        c2.getProducts().add(p4);

        categoryRespository.save(c1);
        categoryRespository.save(c2);

      /*  productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);*/

    }
}
