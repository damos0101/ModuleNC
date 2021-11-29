package com.company;

public class General extends Human {
    private Commander[] commanders;
    public General(String name, int age, boolean canFight, Commander[] commanders) {
        super(name, age, canFight);
        this.commanders = new Commander[2];
        this.commanders = commanders;
    }

    public void manageCommander(Commander commander, Soldier[] soldiers){
        if(commander == null){
            throw new IllegalArgumentException("Commander must be not null");
        }
        else if(soldiers == null){
            throw new IllegalArgumentException("Soldiers must be not null");
        }
        commander.changeSoldiers(soldiers);
    }

    @Override
    public void report(){
        showPassport();
        System.out.println("I am general, i control everyone");
    }
}
