package com.company;

public class Human implements CapableOfFighting {
    private String name;
    private int age;
    private boolean canFight;

    public Human(String name, int age, boolean canFight) {
        this.name = name;
        this.age = age;
        this.canFight = canFight;
    }

    public void showPassport() {
        System.out.println();
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println(canFight() ? "I can fight" : "I can't fight");
    }

    @Override
    public boolean canFight() {
        return canFight;
    }

    @Override
    public void report() {
        showPassport();
        System.out.println("I am not a military man, I do not obey anyone");
    }

    public String getName() {
        return name;
    }
}
