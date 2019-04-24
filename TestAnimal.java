package Assessment1;

/**
 * Created by Donal ON 24/04/2019
 * COMMENTS ON THE PROGRAM GO HERE
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
