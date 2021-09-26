package homework.two.animals;

import homework.two.food.Food;
import homework.two.food.Meat;
/**
 * Абстрактный класс, реализующий травоядного животного со свойством <b>satiety</b>.
 *
 * @version 1.0
 * @autor Pohilenco Valeria
 */
public abstract class Herbivore implements Animal {
    private final int SATIETY_STEP = 5;
    private int satiety;

    Herbivore(){ satiety = 10;}
    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            System.out.println("Травоядные не едят мясо! Накормите животное чем-то другим");
        }else {
            satiety += SATIETY_STEP;
            System.out.println("Животное поело. Энергетический уровень: " + satiety);
        }
    }

}
