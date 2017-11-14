package com.company;

public class Calculator {

    private CalculateStrategy calculateStrategy;

    public Calculator(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public Double performCalculate(Double a, Double b) {
        return calculateStrategy.calculate(a, b);
    }

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }
}
