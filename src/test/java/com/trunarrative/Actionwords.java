package com.trunarrative;

import junit.framework.Assert;

public class Actionwords {

    public CoffeeMachine sut = new CoffeeMachine();
    public void iStartTheCoffeeMachine() {
        sut.start();
    }

    public void iTakeACoffee() {
        sut.takeCoffee();
    }

    public void coffeeShouldBeServed() {
        Assert.assertTrue(sut.coffeeServed);
    }
}