package org.example.checkthisout;

public class ComponentInstallLogger implements ComponentInstallListener{
    @Override
    public void onInstall(Motherboard mb, Component component) {
        System.out.println("Motherboard model: " + mb.model);
        System.out.println("Component: " + component.getComponentType());
    }
}
