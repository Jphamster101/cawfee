package org.example.checkthisout;

public class Motherboard {
    String model;
    CPU installedCPU;
    GPU installedGPU;
    RAM installedRAM;

    public Motherboard(String model) {
        this.model = model;
    }
    public void installComponent(Component component, ComponentInstallListener listener) {
        switch(component.getComponentType()) {
            case CPU -> this.installedCPU = (CPU) component;
            case GPU -> this.installedGPU = (GPU) component;
            case RAM -> this.installedRAM = (RAM) component;
        };

        listener.onInstall(this, component);
    }

   public InstalledComponents getInstalledComponents() {
        return new InstalledComponents();
   }

   public class InstalledComponents {
       public void printDetails() {
           System.out.println("Motherboard: " + Motherboard.this.model);
           System.out.println("CPU: " + Motherboard.this.installedCPU.getName());
           System.out.println("GPU: " + Motherboard.this.installedGPU.getName());
           System.out.println("RAM: " + Motherboard.this.installedRAM.getName());
       }
   }

    /*
    public void installCPU(Component component, ComponentInstallListener listener) {
        this.installedCPU = component;
        listener.onInstall(this, cpu);
    }

    public void installGPU(GPU gpu, ComponentInstallListener listener) {
        this.installedGPU = gpu;
        listener.onInstall(this, gpu);
    }

    public void installRAM(CPU cpu, ComponentInstallListener listener) {
        this.installedCPU = cpu;
        listener.onInstall(this, cpu);
    }
     */
}
