package Animals;

import java.util.Objects;

import static Animals.ELifeState.*;

/**
 * Created by BS-Gorchinskiy on 16.10.2018
 **/

public abstract class Animal {
    private ELifeState eLifeState = AWAKEN;
    public String animalName;
    protected String voice;
    private SkinColor skinColor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return eLifeState == animal.eLifeState &&
                Objects.equals(animalName, animal.animalName) &&
                Objects.equals(voice, animal.voice) &&
                skinColor == animal.skinColor;
    }

    @Override
    public int hashCode() {
        int result = 1;
        return 23 * eLifeState.ordinal() + animalName.hashCode() + voice.hashCode() + skinColor.hashCode();

    }

    public Animal(String animalName, SkinColor skinColor) {
        this.animalName = animalName;
        this.skinColor = skinColor;
    }

    public final void talk() {
        switch (eLifeState) {
            case AWAKEN:
                System.out.println(this.getClass().getName() + " " + animalName + " say:" + voice);
                break;
            case SLEEPING:
            case DEAD:
                System.out.println("Tss." + this.getClass().getName() + " \"" + animalName + "\" is sleeping now..... or die :((");
            default:
                System.out.println("Error . " + this.getClass().getName() + " \"" + animalName + "\" didn't bourn!!!");
        }
    }

    public final void die() {
        eLifeState = DEAD;
        System.out.println("I'm die." + this.getClass().getName());
    }

    public void sleep() {
        System.out.println(this.getClass().getName() + "\" " + animalName + "\" .I'm going to sleep.");
        eLifeState = SLEEPING;
    }

    public final void awake() {
        System.out.println("I'm awake. " + this.getClass().getName());
        eLifeState = AWAKEN;
    }
}