package animals;

import behavior.Run;
import behavior.Voice;
import main.Aviary;

public class Cow extends Herbivore implements Run, Voice {

    public Cow(String name, int satiety, Aviary.AviarySize aviarySize) {
        super(name, satiety, aviarySize);
    }

    @Override
    public void run() {
        System.out.println("Прыг - прыг");
        super.setSatiety(super.getSatiety() - 2 * Carnivorous.SATIETY_STEP);
    }

    @Override
    public String voice() {
        super.setSatiety(super.getSatiety() - Carnivorous.SATIETY_STEP);
        return "Муууу";
    }

}
