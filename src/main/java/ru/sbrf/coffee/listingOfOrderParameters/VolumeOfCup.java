package ru.sbrf.coffee.listingOfOrderParameters;

public enum VolumeOfCup {
    GRANDE(4), BIG(3), MEDIUM(2), SMALL(1);
    public Integer VolumeOfCup;
    VolumeOfCup(Integer VolumeOfCup) {
        this.VolumeOfCup = VolumeOfCup;
    }
}
