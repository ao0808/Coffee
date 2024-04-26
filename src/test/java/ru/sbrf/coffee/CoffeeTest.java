package ru.sbrf.coffee;

import org.junit.Assert;
import org.junit.Test;
import ru.sbrf.coffee.impl.CoffeeMachineVitek;
import ru.sbrf.coffee.listingOfOrderParameters.TypeOfCoffee;
import ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup;
import ru.sbrf.coffee.model.CupOfCoffee;
import ru.sbrf.coffee.model.Order;

public class CoffeeTest extends Assert {

    @Test
    public void builderTest() {
        CoffeeMachineVitek coffeeMachine = CoffeeMachineVitek.builder().amountOfWater(1500).
                amountOfCoffeeBeans(500).cleanCounter(0).build();
        Order newOrder = Order.builder().typeOfCoffee(TypeOfCoffee.ESPRESSO).
                volumeOfCup(VolumeOfCup.BIG).build();

        assertNotNull(coffeeMachine);
        assertNotNull(newOrder);
    }

    @Test
    public void makeCoffeeEspressoTest() {
        verifyCoffeeEspresso(TypeOfCoffee.ESPRESSO, VolumeOfCup.GRANDE);
        verifyCoffeeEspresso(TypeOfCoffee.ESPRESSO, VolumeOfCup.BIG);
        verifyCoffeeEspresso(TypeOfCoffee.ESPRESSO, VolumeOfCup.MEDIUM);
        verifyCoffeeEspresso(TypeOfCoffee.ESPRESSO, VolumeOfCup.SMALL);
    }

    private void verifyCoffeeEspresso(TypeOfCoffee typeOfCoffee, VolumeOfCup volumeOfCup) {
        CoffeeMachineVitek coffeeMachine = CoffeeMachineVitek.builder().amountOfWater(1500).
                amountOfCoffeeBeans(500).cleanCounter(0).build();
        Order newOrder = Order.builder().typeOfCoffee(typeOfCoffee).
                volumeOfCup(volumeOfCup).build();

        CupOfCoffee cup = coffeeMachine.makeCoffee(newOrder);
        assertEquals(typeOfCoffee, cup.getTypeOfCoffee());
        assertEquals(volumeOfCup, cup.getVolumeOfCup());
    }

    @Test
    public void makeCoffeeCappuccinoTest() {
        verifyCoffeeEspresso(TypeOfCoffee.CAPPUCCINO, VolumeOfCup.GRANDE);
        verifyCoffeeEspresso(TypeOfCoffee.CAPPUCCINO, VolumeOfCup.BIG);
        verifyCoffeeEspresso(TypeOfCoffee.CAPPUCCINO, VolumeOfCup.MEDIUM);
        verifyCoffeeEspresso(TypeOfCoffee.CAPPUCCINO, VolumeOfCup.SMALL);
    }

    private void verifyCoffeeCappuccino(TypeOfCoffee typeOfCoffee, VolumeOfCup volumeOfCup) {
        CoffeeMachineVitek coffeeMachine = CoffeeMachineVitek.builder().amountOfWater(1500).
                amountOfCoffeeBeans(500).cleanCounter(0).build();
        Order newOrder = Order.builder().typeOfCoffee(typeOfCoffee).
                volumeOfCup(volumeOfCup).build();

        CupOfCoffee cup = coffeeMachine.makeCoffee(newOrder);
        assertEquals(typeOfCoffee, cup.getTypeOfCoffee());
        assertEquals(volumeOfCup, cup.getVolumeOfCup());
    }

    @Test
    public void makeCoffeeGlaceTest() {
        verifyCoffeeEspresso(TypeOfCoffee.GLACE, VolumeOfCup.GRANDE);
        verifyCoffeeEspresso(TypeOfCoffee.GLACE, VolumeOfCup.BIG);
        verifyCoffeeEspresso(TypeOfCoffee.GLACE, VolumeOfCup.MEDIUM);
        verifyCoffeeEspresso(TypeOfCoffee.GLACE, VolumeOfCup.SMALL);
    }

    private void verifyCoffeeGlace(TypeOfCoffee typeOfCoffee, VolumeOfCup volumeOfCup) {
        CoffeeMachineVitek coffeeMachine = CoffeeMachineVitek.builder().amountOfWater(1500).
                amountOfCoffeeBeans(500).cleanCounter(0).build();
        Order newOrder = Order.builder().typeOfCoffee(typeOfCoffee).
                volumeOfCup(volumeOfCup).build();

        CupOfCoffee cup = coffeeMachine.makeCoffee(newOrder);
        assertEquals(typeOfCoffee, cup.getTypeOfCoffee());
        assertEquals(volumeOfCup, cup.getVolumeOfCup());
    }

}
