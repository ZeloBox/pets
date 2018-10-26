import Animals.Domesticated;
import Animals.SkinColor;
import domesticated.Dog;
import wild.Wolf;

/**
 * Created by BS-Gorchinskiy on 24.10.2018
 **/
@Domesticated(false)
public class AmericanWolf extends Wolf {
    public AmericanWolf(String animalName) {
        super(animalName, SkinColor.BLACK);
    }
}
