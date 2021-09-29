package animals;

import behavior.Run;
import behavior.Swim;
import behavior.Voice;

public class Wolf extends Carnivorous implements Run, Swim, Voice {
    public Wolf(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void run() {
        System.out.println("Прыг-скок-скок");
        super.setSatiety(super.getSatiety() - 2 * Carnivorous.SATIETY_STEP);
    }

    @Override
    public void swim() {
        System.out.println("Бульк-буль");
        super.setSatiety(super.getSatiety() - 3 * Carnivorous.SATIETY_STEP);
    }

    @Override
    public String voice() {
        super.setSatiety(super.getSatiety() -  Carnivorous.SATIETY_STEP);
        return "Ау-ау-ау";

    }
}
