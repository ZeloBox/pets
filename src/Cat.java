/**
 * Created by BS-Gorchinskiy on 16.10.2018
 **/
public class Cat extends Animal {

     Cat() {
        isDie = false;
    }

    @Override
    public void talk() {
        if (!isDie && !isSleep) {
            System.out.println("Meyau!!!");
        }
        else {
            System.out.println("Tss. Cat is sleeping now..... or die :((");
        }
    }

}
