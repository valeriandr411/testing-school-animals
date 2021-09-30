package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;
import main.Aviary;

/**
 * Абстрактный класс, реализующий плотоядного животного со свойством <b>satiety</b>.
 *
 * @version 1.0
 * @autor Pohilenko Valeria
 */
public abstract class Carnivorous extends Animal {
    public static final int SATIETY_STEP = 10;
    public Carnivorous(String name, int satiety, Aviary.AviarySize aviarySize){
        super(name, satiety, aviarySize);
    }
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            throw new WrongFoodException("Попытка накормить "+ getName()+" пищей "+ food.getClass().getSimpleName());
        } else {
            super.setSatiety(super.getSatiety() + SATIETY_STEP);
            System.out.println("Животное "+getName()+" поело. Энергетический уровень: " + super.getSatiety());
        }
    }



}
