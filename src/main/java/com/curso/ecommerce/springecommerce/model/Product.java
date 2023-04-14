package com.curso.ecommerce.springecommerce.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    
    private Integer id;
    private String name;
    private String description;
    private String image;
    private double price;
    private Integer quantity;

    public Product() {

    }

    public Product(Integer id, String name, String description, String image, double price, Integer quantity) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", price="
                + price + ", quantity=" + quantity + "]";
    }

}
