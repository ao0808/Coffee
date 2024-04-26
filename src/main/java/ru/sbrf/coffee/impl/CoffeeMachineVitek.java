package ru.sbrf.coffee.impl;

import lombok.Builder;
import lombok.Data;
import ru.sbrf.coffee.api.AddIngredientInCoffeeMachine;
import ru.sbrf.coffee.api.CoffeeMachine;
import ru.sbrf.coffee.exception.CleaningCoffeeMachineException;
import ru.sbrf.coffee.exception.OutOfCoffeeBeansException;
import ru.sbrf.coffee.exception.OutOfWaterException;
import ru.sbrf.coffee.model.CupOfCoffee;
import ru.sbrf.coffee.model.Order;

@Data
@Builder
public class CoffeeMachineVitek implements CoffeeMachine, AddIngredientInCoffeeMachine {
    private int cleanCounter;
    private int amountOfWater;
    private int amountOfCoffeeBeans;

    public CupOfCoffee makeCoffee(Order newOrder) {
        checkingParameters(newOrder);
        amountOfWater -= newOrder.getVolumeOfCup().VolumeOfCup * 95;
        amountOfCoffeeBeans -= newOrder.getVolumeOfCup().VolumeOfCup * 15;
        cleanCounter++;
        return new CupOfCoffee(newOrder);
    }

    private void checkingParameters(Order newOrder) {
        if (amountOfWater < newOrder.getVolumeOfCup().VolumeOfCup * 95) {
            throw new OutOfWaterException(0, "Out of water");
        } else if (amountOfCoffeeBeans < newOrder.getVolumeOfCup().VolumeOfCup * 25) {
            throw new OutOfCoffeeBeansException(1, "Out of coffee beans");
        } else if (cleanCounter >= 6) {
            throw new CleaningCoffeeMachineException(3, "Barista, cleaning CoffeeMachine!");
        }
    }
    @Override
    public void clean() {
        cleanCounter = 0;
    }

    @Override
    public void addWater() {
        amountOfWater = 1500;
    }

    @Override
    public void addCoffeeBeans() {
        amountOfCoffeeBeans = 500;
    }

    @Override
    public void addAllIngredients() {
        amountOfCoffeeBeans = 500;
        amountOfWater = 1500;
    }
}
