package animals;

import behavior.Run;
import behavior.Swim;
import behavior.Voice;
import main.Aviary;

public class Cat extends Carnivorous implements Run, Swim, Voice {
    public Cat(String name, int satiety, Aviary.AviarySize aviarySize){
        super(name, satiety,aviarySize);
    }

    @Override
    public void run() {
        System.out.println("Прыг-скок");
        super.setSatiety(super.getSatiety() - 2 * Carnivorous.SATIETY_STEP);
    }

    @Override
    public void swim() {
        System.out.println("Буль-буль");
        super.setSatiety(super.getSatiety() - 3 * Carnivorous.SATIETY_STEP);
    }

    @Override
    public String voice() {
        super.setSatiety(super.getSatiety() - Carnivorous.SATIETY_STEP);
        return "Мяу-мяу";
    }

}
