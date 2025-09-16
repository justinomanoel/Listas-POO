package com.aula4;

public class Cell {
    private String imei, nome;
    private Status status;
    private Battery battery;    

    public Cell(String imei, String nome, Status status, int charge) {
        this.imei = imei;
        this.nome = nome;
        this.status = status;
        this.battery = new Battery(charge);
    }

    public void showName(){
        if(isOn() && !battery.isEmpty()){
        System.out.println("Name: " + nome);
        battery.discharging();
        } 
    }
    
    public boolean isOn(){
        return status == Status.ON;
    }

    public void turnOn(){
        if (battery.getCharge() > 0) {
            status = Status.ON;
            battery.discharging();
            System.out.println("Cell is turned on.");
        } else {
            System.out.println("Battery is empty. Please charge the battery.");
        }
    }

    public void turnOff(){
        if (isOn())
            status = Status.OFF;
        System.out.println("Cell is turned off.");
    }

    public Battery getBattery() {
        return battery;
    }


}
