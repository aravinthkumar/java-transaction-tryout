package com.transaction.tryout.order;

public class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) {
        super("Could not find order" + id);
    }
}
