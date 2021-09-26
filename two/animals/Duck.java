package homework.two.animals;

import homework.two.behavior.Fly;
import homework.two.behavior.Run;
import homework.two.behavior.Swim;
import homework.two.behavior.Voice;

public class Duck extends Herbivore implements Fly, Swim, Run, Voice {
    @Override
    public void fly() {
        System.out.println("Пш-пщ");
    }

    @Override
    public void run() {
        System.out.println("Топ-топ");
    }

    @Override
    public void swim() {
        System.out.println("Бульк-бульк");
    }

    @Override
    public String voice() {
        return "Кря-кря";
    }
}
