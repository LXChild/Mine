package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MallardDuck mallard = new MallardDuck();
        RubberDuck  rubber = new RubberDuck();
        DecoyDuck   decoy = new DecoyDuck();
        ModelDuck   model = new ModelDuck();

        mallard.performQuack();
        mallard.performFly();
        rubber.performQuack();
        rubber.performFly();
        decoy.performQuack();
        decoy.performFly();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
