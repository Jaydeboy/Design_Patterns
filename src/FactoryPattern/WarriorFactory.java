package FactoryPattern;

 class WarriorFactory {



    //each static method creates a warrior object with a Axe object as an parameter;
    static Warrior createAxeWarrior(){

        return new Warrior(Weapon.AXE.toString().toLowerCase());
    }
    static Warrior createSwordWarrior(){

        return new Warrior(Weapon.SWORD.toString().toLowerCase());
    }
     static Warrior createBowWarrior(){

         return new Warrior(Weapon.BOW.toString().toLowerCase());
     }
}
