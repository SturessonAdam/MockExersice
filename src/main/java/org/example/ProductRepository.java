package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1, "Test1", 28));
        products.add(new Product(2, "Test2", 28));
        products.add(new Product(3, "Test3", 27.5));
        products.add(new Product(4, "Test4", 29.5));
        products.add(new Product(5, "Test5", 28.5));
        products.add(new Product(6, "Test6", 29.5));
        products.add(new Product(7, "Test7", 28.5));
        products.add(new Product(8, "Test8", 29.5));
        products.add(new Product(9, "Test9", 28.5));
        products.add(new Product(10, "Test10", 29.5));
    }





    public Product findProductByID(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}

