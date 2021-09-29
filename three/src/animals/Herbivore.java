package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

/**
 * Абстрактный класс, реализующий травоядного животного со свойством <b>satiety</b>.
 *
 * @version 1.0
 * @autor Pohilenko Valeria
 */
public abstract class Herbivore extends Animal {
    private final int SATIETY_STEP = 5;

    public Herbivore(String name, int satiety){ super(name,satiety);}

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            throw new WrongFoodException("Попытка накормить "+ this.getName()+" пищей "+ food.getClass().getSimpleName());
        } else {
            super.setSatiety(super.getSatiety() + SATIETY_STEP);
            System.out.println("Животное "+getName()+" поело. Энергетический уровень: " + super.getSatiety());
        }
    }

}
