package animals;

import behavior.Run;
import behavior.Swim;

public class Rabbit extends Herbivore implements Run, Swim {
    public Rabbit(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void run() {
        System.out.println("Прыг-скок-прыг-скок");
        super.setSatiety(super.getSatiety() - 2 * Carnivorous.SATIETY_STEP);
    }

    @Override
    public void swim() {
        System.out.println("Бульк");
        super.setSatiety(super.getSatiety() - Carnivorous.SATIETY_STEP);

    }
}
