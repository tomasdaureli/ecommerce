package com.curso.ecommerce.springecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ORDER_DETAIL")
public class OrderDetail {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double quantity;
    private double price;
    private double bill;

    // Relaciones
    @OneToOne
    private Order order;
    @ManyToOne
    private Product product;

    // Metodos constructores y toString
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
