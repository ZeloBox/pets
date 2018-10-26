package domesticated;

import Animals.Animal;
import Animals.Domesticated;
import Animals.SkinColor;

import java.lang.annotation.Inherited;

/**
 * Created by BS-Gorchinskiy on 16.10.2018
 **/

@Domesticated(true)
public class Cat extends Animal {
    public Cat(String animalName, SkinColor skinColor) {
        super(animalName,
                skinColor);
        voice="Meyau!!!";
    }
}
