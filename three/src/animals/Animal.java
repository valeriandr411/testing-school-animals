package animals;

import food.Food;
import food.WrongFoodException;
import main.Aviary;

import java.util.Objects;

public abstract class Animal {
   private final Aviary.AviarySize aviarySize = setAviarySize();
   private final String name;
   private int satiety;

   public Animal(String name, int satiety){
      this.name = this.getClass().getSimpleName() + "-" + name;
      setSatiety(satiety);
   }

   public abstract void eat(Food food) throws WrongFoodException;

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Animal animal = (Animal) o;
      return satiety == animal.satiety && aviarySize == animal.aviarySize && Objects.equals(name, animal.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(aviarySize, name, satiety);
   }

   public void setSatiety(int satiety) {
      this.satiety = satiety;
   }

   public int getSatiety() {
      return satiety;
   }

   public String getName() {
      return name;
   }

   public Aviary.AviarySize setAviarySize(){
      Aviary.AviarySize aviarySize = Aviary.AviarySize.EXTRA_SMALL;

      String nameClass = this.getClass().getSimpleName();
      switch (nameClass){
         case "Duck","Fish":
            aviarySize = Aviary.AviarySize.EXTRA_SMALL;
            break;
         case "Cat","Rabbit":
            aviarySize = Aviary.AviarySize.SMALL;
            break;
         case "Wolf":
            aviarySize = Aviary.AviarySize.MEDIUM;
            break;
         case "Cow":
            aviarySize = Aviary.AviarySize.LARGE;
            break;
      };
      return aviarySize;
   }

   public Aviary.AviarySize getAviarySize() {
      return aviarySize;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName()+"{" +
              "aviarySize=" + aviarySize +
              ", name='" + name + '\'' +
              ", satiety=" + satiety +
              '}';
   }
}
