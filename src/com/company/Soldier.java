package com.company;

public class Soldier extends Human{
    private String rank;
    private Commander commander;

    public Soldier(String name, int age, boolean canFight, String rank) {
        super(name, age, canFight);
        this.rank = rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    @Override
    public void report() {
        showPassport();
        System.out.println("My Commander is " + commander.getName());
    }

    public void setCommander(Commander commander) {
        if(commander == null){
            throw new IllegalArgumentException("Commander must be not null");
        }
        this.commander = commander;
    }
}
