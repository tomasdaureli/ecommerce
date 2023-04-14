package com.curso.ecommerce.springecommerce.model;

import java.util.Date;

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
@Table(name = "ORDERS")
public class Order {
    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date dateCreation;
    private Date dateReceive;
    private double bill;

    // Relaciones
    @ManyToOne
    private User user;
    @OneToOne(mappedBy = "order")
    private OrderDetail detail;

    // Metodos constructores y toString
    public Order() {

    }

    public Order(Integer id, String number, Date dateCreation, Date dateReceive, double bill, User user) {
        super();
        this.id = id;
        this.number = number;
        this.dateCreation = dateCreation;
        this.dateReceive = dateReceive;
        this.bill = bill;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", number=" + number + ", dateCreation=" + dateCreation + ", dateReceive="
                + dateReceive + ", bill=" + bill + "]";
    }
    
}
