package com.progmatic.jdbc.model;

public record OrderItem(Integer orderId, Pizza pizza, Short number) {
    @Override
    public String toString() {
        return String.format("\n\t%s: %d db", pizza.name(), number);
    }
}
