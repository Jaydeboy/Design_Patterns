package FactoryPattern;

 class Warrior {

    final private String weapon;

    Warrior(String inWeapon){
        weapon = inWeapon;
    }
    String getWeapon(){
        return weapon;
    }


}
