package com.transaction.tryout.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int amount;
    private String customer;

    protected Order() {
    }

    public Order(int amount, String customer) {
        this.amount = amount;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return String.format("Order[id=%d, amount='%d', customer='%s']", id, amount, customer);
    }

}
