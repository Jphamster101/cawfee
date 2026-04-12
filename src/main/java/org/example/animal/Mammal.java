package org.example.animal;

public abstract class Mammal extends Animal {
    boolean hasFur = true;
    int numberOfLimbs = 4;
    public Mammal(String name, int age ) {
        super(name, age);
        setAnimalType();
        setBloodedType(BloodedType.WARM_BLOODED);
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    @Override
    protected void setAnimalType() {
        setAnimalTypeValue(AnimalType.MAMMAL_TYPE);
    }

}
