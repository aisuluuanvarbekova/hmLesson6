
        package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss=new Boss(200,400," Power ",new  Weapon("Автомат","Автомат АК 47"));



        System.out.println(""+boss.getHealth()+" "+boss.getDamage()+" "+boss.getSuperAbilities()+" "+boss.getWeapon() );
    }


}

