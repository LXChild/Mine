package com.company;

public class MultiplyStrategy implements CalculateStrategy {
    @Override
    public Double calculate(Double a, Double b) {
        return a * b;
    }
}
