/**
 * Created by BS-Gorchinskiy on 16.10.2018
 **/

public abstract class Animal {
    boolean isDie = false;
    boolean isSleep = false;
    String animalName;
    String voice;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void talk() {
        if (!isDie && !isSleep) {
            System.out.println( this.getClass().getName()+" "+animalName + " say:"+voice);
        } else {
            System.out.println("Tss. "+ this.getClass().getName()+" "+animalName+" is sleeping now..... or die :((");
        }
    }

    ;

    public void die() {
        isDie = true;
        System.out.println("I'm die." + this.getClass().getName());
    }

    void sleep() {
        System.out.println(this.getClass().getName()+" .I'm going to sleep.");
        isSleep=true;
    }

    public void awake() {
        System.out.println("I'm awake." + this.getClass().getName());
        this.isSleep = false;
    }
}
