package com.curso.ecommerce.springecommerce.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    
    private Integer id;
    private String number;
    private Date dateCreation;
    private Date dateReceive;
    private double bill; 

    public Order() {

    }

    public Order(Integer id, String number, Date dateCreation, Date dateReceive, double bill) {
        super();
        this.id = id;
        this.number = number;
        this.dateCreation = dateCreation;
        this.dateReceive = dateReceive;
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", number=" + number + ", dateCreation=" + dateCreation + ", dateReceive="
                + dateReceive + ", bill=" + bill + "]";
    }
    
}
