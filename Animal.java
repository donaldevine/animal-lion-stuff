package animal-lion-stuff;

/**
 * Created by Donal ON 24/04/2019
 * Animal Base Class
 */
public class Animal {
   protected String food;
   protected int lifeExpectancy;

   public Animal(){

   }

   public Animal(String food){
      this.food = food;
   }

   public Animal(int lifeExpectancy){
      this.lifeExpectancy = lifeExpectancy;
   }

   public Animal(String food, int lifeExpectancy){
      this.food = food;
      this.lifeExpectancy = lifeExpectancy;
   }

   public String toString(){
      return "This " + this.food + " eater has a life expectancy of " + this.lifeExpectancy + " years.";
   }

}//class
