package homework.two.animals;

import homework.two.behavior.Run;
import homework.two.behavior.Swim;
import homework.two.behavior.Voice;

public class Wolf extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Прыг-скок-скок");
    }

    @Override
    public void swim() {
        System.out.println("Бульк-буль");
    }

    @Override
    public String voice() {
        return "Ау-ау-ау";
    }
}
