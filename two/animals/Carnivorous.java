package homework.two.animals;

import homework.two.food.Food;
import homework.two.food.Grass;
/**
 * Абстрактный класс, реализующий плотоядного животного со свойством <b>satiety</b>.
 *
 * @version 1.0
 * @autor Pohilenco Valeria
 */
public abstract class Carnivorous implements Animal {
    private static final int SATIETY_STEP = 10;
    private int aviarySize;
    private int satiety;

    Carnivorous() {
        satiety = 20;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Плотоядные не едят траву! Накормите животное чем-то другим");
        } else {
            satiety += SATIETY_STEP;
            System.out.println("Животное поело. Энергетический уровень: " + satiety);
        }
    }



}
