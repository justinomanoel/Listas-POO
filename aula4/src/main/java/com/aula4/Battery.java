package com.aula4;

public class Battery {
    private int charge;

    
    public Battery(int charge) {
        this.charge = charge;
    }

    public void charging(){
        if (this.charge < 100) {
            this.charge++;
        } else {
            System.out.println("Battery is fully charged.");
        }
    }

    public void discharging(){
        if (this.charge > 0) {
            this.charge--;
        } else {
            System.out.println("Battery is fully discharged.");
        }
    }
    
    public boolean isEmpty(){
        return charge == 0;
    }

    public int getCharge() {
        return this.charge;
    }

    
}
