package com.trunarrative;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testSimpletestUidd06a876fd71b4bf6994f6888c3dd366d() {
        // Given I start the coffee machine
        actionwords.iStartTheCoffeeMachine();
        // When I take a coffee
        actionwords.iTakeACoffee();
        // Then coffee should be served
        actionwords.coffeeShouldBeServed();
    }
}