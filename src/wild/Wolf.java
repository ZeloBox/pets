package wild;

import Animals.Animal;
import Animals.SkinColor;

/**
 * Created by BS-Gorchinskiy on 16.10.2018
 **/
public class Wolf extends Animal {
    public Wolf(String animalName, SkinColor skinColor) {
        super(animalName,
                skinColor);
        voice="Meyau!!!";
    }
}
