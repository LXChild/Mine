package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println(calculator.performCalculate(2D, 3D));
        calculator.setCalculateStrategy(new SubtractStrategy());
        System.out.println(calculator.performCalculate(2D, 3D));
        calculator.setCalculateStrategy(new MultiplyStrategy());
        System.out.println(calculator.performCalculate(2D, 3D));
        calculator.setCalculateStrategy(new DivideStrategy());
        System.out.println(calculator.performCalculate(2D, 3D));
    }
}
