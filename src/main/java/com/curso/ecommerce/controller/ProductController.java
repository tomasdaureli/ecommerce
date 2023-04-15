package com.curso.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.ecommerce.springecommerce.model.Product;
import com.curso.ecommerce.springecommerce.model.User;
import com.curso.ecommerce.springecommerce.service.ProductService;

@Controller
@RequestMapping("/productos")
public class ProductController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;
    
    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("productos", productService.findAll());
        return "Hola mundo";
    }

    @GetMapping("/create")
    public String create() {
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Product product) {
        LOGGER.info("Este es el objeto producto {}", product);
        User user = new User(1, "", "", "", "", "", "");
        product.setUser(user);
        productService.save(product);
        return "redirect:/productos";
    }

}
