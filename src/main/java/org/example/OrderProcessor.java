package org.example;

public class OrderProcessor {

    private ProductRepository productRepository;

    public OrderProcessor(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public double calculateTotalPrice(){
        double totalPrice = 0.0;
        Product product1 = productRepository.findProductByID(1);
        Product product2 = productRepository.findProductByID(2);

        if (product1 != null) {
            totalPrice += product1.getPrice();
        }

        if (product2 != null) {
            totalPrice += product2.getPrice();
        }

        return totalPrice;
    }


}
