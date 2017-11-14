package com.company;

public class SubtractStrategy implements CalculateStrategy {
    @Override
    public Double calculate(Double a, Double b) {
        return a - b;
    }
}
