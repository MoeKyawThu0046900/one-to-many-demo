package com.example.onetomanytest.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int qty;
    private double price;

   // @ManyToOne
   // private Category category;

    public Product(String name,int qty,double price){
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

}
