package homework.two.animals;

import homework.two.behavior.Run;
import homework.two.behavior.Voice;

public class Cow extends Herbivore implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Буль");
    }

    @Override
    public String voice() {
        return "Муууу";
    }

}
