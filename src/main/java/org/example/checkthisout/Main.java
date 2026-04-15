package org.example.checkthisout;

public class Main {
    static void main(String[] args) {
        ComponentInstallLogger logger = new ComponentInstallLogger();
        CPU cpu_ryzen = new CPU(24, 12, "AI 9 HX PRO 475", 2);
        GPU gpu_nvidia = new GPU("RTX 3060", GPU_Manufacturers.NVIDIA, 12);
        RAM ram_samsung = new RAM("G. Skill", RAM_Manufacturers.SAMSUNG, 32);
        Motherboard msi_mb = new Motherboard("MSI");

        msi_mb.installComponent(cpu_ryzen, logger);
        msi_mb.installComponent(gpu_nvidia, logger);
        msi_mb.installComponent(ram_samsung, logger);

        msi_mb.getInstalledComponents().printDetails();
    }
}
