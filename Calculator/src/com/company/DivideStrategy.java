package com.company;

public class DivideStrategy implements CalculateStrategy {
    @Override
    public Double calculate(Double a, Double b) {
        return a / b;
    }
}
