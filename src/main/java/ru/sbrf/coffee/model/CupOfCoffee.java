package ru.sbrf.coffee.model;

import ru.sbrf.coffee.listingOfOrderParameters.TypeOfCoffee;
import ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup;

public class CupOfCoffee implements ru.sbrf.coffee.api.CupOfCoffee {
    VolumeOfCup volumeOfCup;
    TypeOfCoffee typeOfCoffee;

    public CupOfCoffee(Order newOrder) {
        this.typeOfCoffee = newOrder.getTypeOfCoffee();
        this.volumeOfCup = newOrder.getVolumeOfCup();
    }
    @Override
    public VolumeOfCup getVolumeOfCup() {
        return volumeOfCup;
    }

    @Override
    public TypeOfCoffee getTypeOfCoffee() {
        return typeOfCoffee;
    }
}
