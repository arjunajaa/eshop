package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;

import java.util.List;

public interface ProductService {
    public Product create(Product product);
    public String delete(String productId);
    public List<Product> findAll();
    public Product findById(String productId);
    public void update(String productId, Product product);
}