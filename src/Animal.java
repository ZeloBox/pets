/**
 * Created by BS-Gorchinskiy on 16.10.2018
 **/

public abstract class Animal {
    ELifeState eLifeState = ELifeState.AWAKEN;

    String animalName;
    String voice;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void talk() {
        switch (eLifeState) {
            case AWAKEN:
                System.out.println(this.getClass().getName() + " " + animalName + " say:" + voice);
                break;
            case SLEEPING:
            case DEAD:
                System.out.println("Tss. " + this.getClass().getName() + " " + animalName + " is sleeping now..... or die :((");
                default:
                    System.out.println("Error"+this.getClass().getName() + " " + animalName + " didn't bourn!!!");
        }
    }

    ;

    public void die() {
        eLifeState=ELifeState.DEAD;
        System.out.println("I'm die." + this.getClass().getName());
    }

    void sleep() {
        System.out.println(this.getClass().getName() + " .I'm going to sleep.");
        eLifeState=ELifeState.SLEEPING;
    }

    public void awake() {
        System.out.println("I'm awake." + this.getClass().getName());
        eLifeState=ELifeState.AWAKEN;
    }
}
