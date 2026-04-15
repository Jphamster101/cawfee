package org.example.checkthisout;

public class CPU implements Component{
    private final int threadCount;
    private final int cores;
    private final String name;
    private final int processorSpeed;

    public CPU(int threadCount, int cores, String name, int processorSpeed) {
        this.threadCount = threadCount;
        this.cores = cores;
        this.name = name;
        this.processorSpeed = processorSpeed;
    }

    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public ComponentType getComponentType() {
        return ComponentType.CPU;
    }
}
