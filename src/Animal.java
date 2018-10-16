/**
 * Created by BS-Gorchinskiy on 16.10.2018
 **/

public abstract class Animal {
    boolean isDie = false;
    boolean isSleep = false;

    public abstract void talk();

    public void die() {
        isDie = false;
        System.out.println("I'm die." + this.getClass().getName());
    }

    void sleep() {
        System.out.println(this.getClass().getName()+" .I'm going to sleep.");
        isSleep=true;
    }

    public void awake() {
        System.out.println("I'm awake." + this.getClass().getName());
    }
}
