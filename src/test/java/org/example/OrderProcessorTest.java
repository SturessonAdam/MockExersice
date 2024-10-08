package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderProcessorTest {

    @Test
    void calculateTotalPrice() {
        //given
        ProductRepository productRepository = mock(ProductRepository.class);
        OrderProcessor orderProcessor = new OrderProcessor(productRepository);


        //when
        when(productRepository.findProductByID(1)).thenReturn(new Product(1, "product 1", 50));
        when(productRepository.findProductByID(2)).thenReturn(new Product(2, "product 2", 100));
        double totalPrice = orderProcessor.calculateTotalPrice();


        //then
        assertEquals(150, totalPrice);
    }
}