package com.company;

public class Commander extends Human{
    private Soldier[] soldiers;
    General general;

    public Commander(String name, int age, boolean canFight, Soldier[] soldiers) {
        super(name, age, canFight);
        this.soldiers = new Soldier[3];
        this.soldiers = soldiers;
    }

    public void setRankForSoldier(Soldier soldier, String rank){
        soldier.setRank(rank);
    }

    @Override
    public void report() {
        showPassport();
        System.out.println("My General is " + general.getName());
    }

    public void changeSoldiers(Soldier[] soldiers){
        if(soldiers == null){
            throw new IllegalArgumentException("Soldiers must be not null");
        }
        this.soldiers = soldiers;
    }

    public void setGeneral(General general){
        if(general == null){
            throw new IllegalArgumentException("General must be not null");
        }
        this.general = general;
    }
}
