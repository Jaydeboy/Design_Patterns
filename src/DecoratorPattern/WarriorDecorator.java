package DecoratorPattern;

class WarriorDecorator implements Warrior {

    BasicWarrior warrior;

    WarriorDecorator(BasicWarrior hw){
        warrior = hw;

    }
    public void getDescription(){
        this.warrior.getDescription();
    }

}
