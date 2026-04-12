package org.example.animal;

public class Amphibian extends Animal {
    public Amphibian(String name, int age) {
        super(name, age);
        boolean laysEggs;
        setAnimalType();
        setBloodedType(BloodedType.COLD_BLOODED);
    }

    @Override
    protected void setAnimalType() {
        setAnimalTypeValue(AnimalType.AMPHIBIAN);
    }

}
