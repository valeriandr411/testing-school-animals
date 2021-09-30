package animals;

import behavior.Swim;
import main.Aviary;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name, int satiety, Aviary.AviarySize aviarySize) {
        super(name, satiety,aviarySize);
    }

    @Override
    public void swim() {
        System.out.println("Буль-буль-буль");
        super.setSatiety(super.getSatiety() - 2 * Carnivorous.SATIETY_STEP);
    }
}
