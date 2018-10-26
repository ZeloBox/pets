package Animals;

import java.lang.annotation.*;

/**
 * Created by BS-Gorchinskiy on 26.10.2018
 **/

/**
 *  <see >@Inherited</see>
 *  Должна быть обязательно проставлена,
 *  если нужно чтобы аннотация повилась у наследников аннотированного класса
 *
 */
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Domesticated {
    boolean value();
}