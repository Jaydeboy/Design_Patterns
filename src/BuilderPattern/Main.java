package BuilderPattern;

public class Main {
    public static void main(String[] args) {

        Warrior HumanWarrior = new Warrior.WarriorBuilder("Human Warrior")
                .agility(10)
                .durability(10.5)
                .strenght(20)
                .build();
        HumanWarrior.getDescription();

        System.out.println("\n");

        Warrior ElfWarrior = new Warrior.WarriorBuilder("Elf Warrior")
                .agility(20)
                .durability(5.5)
                .strenght(10)
                .build();
        ElfWarrior.getDescription();

        System.out.println("\n");
        Warrior OrkWarrior = new Warrior.WarriorBuilder("Ork Warrior")
                .agility(5)
                .durability(20.5)
                .strenght(40)
                .build();
        OrkWarrior.getDescription();


    }

}


class Warrior {

    private String warriorType;
    private int agility;
    private int strength;
    private double durablity;


    static class WarriorBuilder {

        private String warriorType;
        private int agility;
        private int Strength;
        private double durablity;


        WarriorBuilder(String type) {
            this.warriorType = type;
        }

        WarriorBuilder agility(int inAgility) {
            this.agility = inAgility;
            return this;
        }

        WarriorBuilder strenght(int inStrenght) {
            this.Strength = inStrenght;
            return this;
        }

        WarriorBuilder durability(double inDurability) {
            this.durablity = inDurability;
            return this;
        }

        Warrior build() {
            Warrior war = new Warrior();
            war.warriorType = this.warriorType;
            war.agility = this.agility;
            war.durablity = this.durablity;
            war.strength = this.Strength;
            return war;

        }

    }

    void getDescription(){
        System.out.println("**Warrior Description**"+"\n"+"Type: "+warriorType+"\n"+"Strenght: "
                +strength+"\n"+"Agility: "+agility +"\n"+"Durability: "+durablity+"\n"+"Strenght: "+strength);

    }


}

