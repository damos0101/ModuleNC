package com.company;

public class Main {

    public static void main(String[] args) {
        Human[] army = new Human[9];
        Soldier soldier1 = new Soldier("Vasya", 22, true, "private");
        Soldier soldier2 = new Soldier("Petr", 20, true, "private");
        Soldier soldier3 = new Soldier("Alex", 23, true, "sergeant");
        Soldier[] platoon1 = new Soldier[3];
        platoon1[0] = soldier1;
        army[0] = soldier1;
        platoon1[1] = soldier2;
        army[1] = soldier2;
        platoon1[2] = soldier3;
        army[2] = soldier3;

        Commander commander1 = new Commander("Taras", 35, true, platoon1);
        for (int i = 0; i < 3; ++i) {
            platoon1[i].setCommander(commander1);
        }
        Soldier soldier4 = new Soldier("Maxim", 19, true, "private");
        Soldier soldier5 = new Soldier("Dmytro", 20, false, "private");
        Soldier soldier6 = new Soldier("Sergey", 22, true, "private");
        Soldier[] platoon2 = new Soldier[3];
        platoon2[0] = soldier4;
        army[3] = soldier4;
        platoon2[1] = soldier5;
        army[4] = soldier5;
        platoon2[2] = soldier6;
        army[5] = soldier6;


        Commander commander2 = new Commander("Artem", 36, false, platoon2);
        for (int i = 0; i < 3; ++i) {
            platoon2[i].setCommander(commander2);
        }

        Commander[] commanders = new Commander[2];

        commanders[0] = commander1;
        commanders[1] = commander2;
        army[6] = commander1;
        army[7] = commander2;
        General general = new General("Danil", 44, false, commanders);
        for (int i = 0; i < 2; ++i) {
            commanders[i].setGeneral(general);
        }
        army[8] = general;

        for (int i = 0; i < army.length;++i){
            army[i].report();
        }
    }
}
