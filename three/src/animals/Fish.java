package animals;

import behavior.Swim;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void swim() {
        System.out.println("Буль-буль-буль");
        super.setSatiety(super.getSatiety() - 2 * Carnivorous.SATIETY_STEP);
    }
}
