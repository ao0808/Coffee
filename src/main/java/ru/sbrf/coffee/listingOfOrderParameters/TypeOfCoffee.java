package ru.sbrf.coffee.listingOfOrderParameters;

public enum TypeOfCoffee {
    CAPPUCCINO("Cappuccino"), GLACE("Glace"), ESPRESSO("Espresso");

    public String coffee;
    TypeOfCoffee(String coffee) {
        this.coffee = coffee;
    }

}
