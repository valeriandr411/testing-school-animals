package animals;

import behavior.*;
import main.Aviary;

public class Duck extends Herbivore implements Fly, Swim, Run, Voice {
    public Duck(String name, int satiety, Aviary.AviarySize aviarySize) {
        super(name, satiety,aviarySize);
    }

    @Override
    public void fly() {
        System.out.println("Пш-пщ");
    }

    @Override
    public void run() {
        System.out.println("Топ-топ");
        super.setSatiety(super.getSatiety() - 3 * Carnivorous.SATIETY_STEP);
    }

    @Override
    public void swim() {
        System.out.println("Бульк-бульк");
        super.setSatiety(super.getSatiety() - 2 * Carnivorous.SATIETY_STEP);
    }

    @Override
    public String voice() {
        super.setSatiety(super.getSatiety() -  Carnivorous.SATIETY_STEP);
        return "Кря-кря";
    }
}
