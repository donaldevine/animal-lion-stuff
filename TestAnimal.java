package animal-lion-stuff;

/**
 * Created by Donal ON 24/04/2019
 * Test class
 */
public class TestAnimal {
   public static void main(String[] args) {
      Lion myLion1 = new Lion("human", 100,23, "Ibra", true);
      Lion myLion2 = new Lion("meat", 90, 30, "Conor", false);
      myLion1.setAge(3);
      System.out.println(myLion1);
      System.out.println("Number of Lions created: " + Lion.numberOfLions());
   }//main
}//class
