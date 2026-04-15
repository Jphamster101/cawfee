package org.example.checkthisout;

public class RAM implements Component {
    final String name;
    final RAM_Manufacturers manufacturer;
    final int size;

    public RAM(String name, RAM_Manufacturers manufacturer, int size) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.size = size;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ComponentType getComponentType() {
        return ComponentType.RAM;
    }
}
