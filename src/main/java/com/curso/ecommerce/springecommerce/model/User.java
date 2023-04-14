package com.curso.ecommerce.springecommerce.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String phone;
    private String tipo;

    public User() {

    }

    public User(Integer id, String name, String username, String email, String password, String phone, String tipo) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", password="
                + password + ", phone=" + phone + ", tipo=" + tipo + "]";
    }

}
