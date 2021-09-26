package homework.two;

import homework.two.animals.Animal;
import homework.two.behavior.Voice;
import homework.two.food.Food;
/**
 * Класс, реализующий работника
 *
 * @version 1.0
 * @autor Pohilenco Valeria
 */
public class Worker {
    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public <T extends Voice> String getVoice(T animal){
        return animal.voice();
    }
}
