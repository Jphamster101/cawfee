package org.example.animal;

public abstract class Animal{
    enum BloodedType {
        WARM_BLOODED,
        COLD_BLOODED
    }

    protected enum AnimalType {
        MAMMAL_TYPE,
        AMPHIBIAN,
        REPTILE,
        BIRD
    }

    private final String name;
    private final int age;
    private String action;
    private String sound;
    private AnimalType animalType;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        setAnimalType();
    }
    void setBloodedType(BloodedType b) {
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getSound() {
        System.out.println(this.name + " makes a '" + this.sound + "' sound");
    }

    public void getAction() {
        System.out.println(this.name + " " + this.action.toUpperCase() + "s as their action");
    }

    protected abstract void setAnimalType();

    protected void setAnimalTypeValue(AnimalType a) {
        this.animalType = a;
    }
}