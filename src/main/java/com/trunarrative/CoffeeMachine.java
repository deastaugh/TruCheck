package com.trunarrative;

public class CoffeeMachine {
    private boolean started = false;
    public boolean coffeeServed = false;
    public void start() {
        started = true;
    }
    public void takeCoffee() {
        if (started) {
            coffeeServed = true;

        }
    }
}
