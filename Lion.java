package animal-lion-stuff;

/**
 * Created by Donal ON 24/04/2019
 * Lion Sub Class
 */
public class Lion extends Animal {
   static int lionCount = 0;
   private int age;
   private String name;
   private boolean hasMane = false;

   public Lion(){
      lionCount++;
   }

   public Lion(String food, int lifeExpectancy, int age, String name, boolean hasMane){
      this();
      this.food = food;
      this.lifeExpectancy = lifeExpectancy;
      this.age = age;
      this.name = name;
      this.hasMane = hasMane;
   }

   public void setAge(int value){
      this.age = value;
   }

   public static int numberOfLions(){
      return  lionCount;
   }

   public String toString(){
      if (hasMane){
         return super.toString() + " Has a mane.";
      }else{
         return super.toString()  + " Does not have a mane.";
      }
   }
}//class
