package DecoratorPattern;

class HumanWarrior extends WarriorDecorator{

    HumanWarrior(BasicWarrior w){
        super(w);
    }
    void getDescrpition(){
        super.getDescription();
    }
}
