import Animals.Animal;
import Animals.Domesticated;

import java.lang.annotation.Annotation;

/** Created by BS-Gorchinskiy on 16.10.2018 **/

public class Main {
    static void checkForIdenticalAnimal(Animal o1, Animal o2) {
        if (o1.hashCode() == o2.hashCode() && (o1.equals(o2))) {
            System.out.println(o1.animalName + " is identical as " + o2.animalName);
        } else {
            System.out.println(o1.animalName + " is NOT identical as " + o2.animalName);
        }
    }

    static void printStatusOfDomistacated(Animal a) {
        if (isDomesticated(a)) {
            System.out.println(a.getClass().getName() + " is domesticated animal!");
        } else {
            System.out.println(a.getClass().getName() + " is NOT yet domesticated animal !");
        }
    }

    static boolean isDomesticated(Animal o) {
        Annotation[] annotation = o.getClass().getAnnotationsByType(Domesticated.class);
        if (annotation == null) return false;
        for (Annotation anot : annotation) {
            if ((anot instanceof Domesticated) && (anot.annotationType().getAnnotations())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Animal anim1 = new Persian("Persen");
        Animal anim2 = new Basset("Bobik");
        Animal anim3 = new Basset("Sharik");
        Animal anim4 = new Vodolaz("Bobik");
        Animal anim5 = new Ragamaffin("Mashka");
        Animal anim6 = new AmericanWolf("Noname");
        Animal anim7 = new GreesleyBear("Noname");

        anim1.talk();
        anim2.talk();
        anim1.sleep();
        anim1.talk();
        anim1.awake();
        anim1.talk();
        anim2.die();
        anim2.talk();
        System.out.println();
        // проверки реализации hashcode и equals
        Main.checkForIdenticalAnimal(anim2, anim2);
        Main.checkForIdenticalAnimal(anim2, anim4);
        System.out.println();
        // проверка аннотаций
        Main.printStatusOfDomistacated(anim4);
        Main.printStatusOfDomistacated(anim6);
        Main.printStatusOfDomistacated(anim7);
    }

}
