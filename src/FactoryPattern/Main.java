package FactoryPattern;

public class Main {

    public static void main(String[] args) {

        //a reference to a warrior object. The object is created by the WarriorFactory class
        Warrior warrior = WarriorFactory.createAxeWarrior();
        System.out.println("A warrior was created with an "+warrior.getWeapon()+" as a weapon");

        //The reference is switch to a new warrior object created by the WarriorFactory
        warrior = WarriorFactory.createSwordWarrior();
        System.out.println("A warrior was created with an "+warrior.getWeapon()+" as a weapon");

        warrior = WarriorFactory.createBowWarrior();
        System.out.println("A warrior was created with an "+warrior.getWeapon()+" as a weapon");



    }

}
