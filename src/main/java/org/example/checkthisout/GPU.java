package org.example.checkthisout;

public class GPU implements Component {
    String name;
    GPU_Manufacturers manufacturer;
    int vram;

    public GPU(String name, GPU_Manufacturers manufacturers, int vram) {
        this.name = name;
        this.manufacturer = manufacturers;
        this.vram = vram;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ComponentType getComponentType() {
        return ComponentType.GPU;
    }
}
