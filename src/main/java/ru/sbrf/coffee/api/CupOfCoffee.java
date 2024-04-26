package ru.sbrf.coffee.api;


import ru.sbrf.coffee.listingOfOrderParameters.TypeOfCoffee;
import ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup;

public interface CupOfCoffee {
    VolumeOfCup getVolumeOfCup();
    TypeOfCoffee getTypeOfCoffee();
}
