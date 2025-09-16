package com.aula4;

public class Aula4 {
    public static void main(String[] args) {
        //Battery battery = new Battery(100);
        Cell cell = new Cell("123456789", "My Cell", Status.ON, 100);

        System.out.println("Battery is empty: " + cell.getBattery().isEmpty());
        cell.turnOn();
        cell.getBattery().discharging();
        System.out.println("Battery charge: " + cell.getBattery().getCharge());
        cell.getBattery().charging();
        System.out.println("Battery charge: " + cell.getBattery().getCharge());
        cell.turnOff();
        cell.turnOn();
        cell.getBattery().discharging();
        cell.showName();
        System.out.println("Battery charge: " + cell.getBattery().getCharge());

    }
}
