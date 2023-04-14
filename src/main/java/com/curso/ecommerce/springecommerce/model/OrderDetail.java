package com.curso.ecommerce.springecommerce.model;

public class OrderDetail {

    private Integer id;
    private String name;
    private double quantity;
    private double price;
    private double bill;

    public OrderDetail() {

    }

    public OrderDetail(Integer id, String name, double quantity, double price, double bill) {
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "OrderDetail [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", bill="
                + bill + "]";
    }
    
}
