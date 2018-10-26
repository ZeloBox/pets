package domesticated;

import Animals.Animal;
import Animals.Domesticated;
import Animals.SkinColor;

/**
 * Created by BS-Gorchinskiy on 16.10.2018
 **/
@Domesticated(true)
public class Cow extends Animal {
    public Cow(String animalName, SkinColor skinColor) {
        super(animalName, skinColor);
        voice="Gav !!!";
    }
}