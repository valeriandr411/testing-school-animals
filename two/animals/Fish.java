package homework.two.animals;

import homework.two.behavior.Swim;

public class Fish extends Carnivorous implements Swim {
    @Override
    public void swim() {
        System.out.println("Буль-буль-буль");
    }
}
