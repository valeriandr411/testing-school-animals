package homework.two.animals;

import homework.two.behavior.Run;
import homework.two.behavior.Swim;

public class Rabbit extends Herbivore implements Run, Swim {
    @Override
    public void run() {
        System.out.println("Прыг-скок-прыг-скок");
    }

    @Override
    public void swim() {
        System.out.println("Бульк");

    }
}
