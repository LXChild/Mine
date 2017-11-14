package com.company;

public class AddStrategy implements CalculateStrategy {
    @Override
    public Double calculate(Double a, Double b) {
        return a + b;
    }
}
