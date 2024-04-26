package ru.sbrf.coffee.model;

import lombok.Builder;
import lombok.Data;
import ru.sbrf.coffee.listingOfOrderParameters.TypeOfCoffee;
import ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup;

import java.util.Objects;

@Data
@Builder
public class Order {
    private VolumeOfCup volumeOfCup;
    private TypeOfCoffee typeOfCoffee;

    public Order(VolumeOfCup volumeOfCup, TypeOfCoffee typeOfCoffee) {
        this.volumeOfCup = volumeOfCup;
        this.typeOfCoffee = typeOfCoffee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeOfCup, typeOfCoffee);
    }

}
