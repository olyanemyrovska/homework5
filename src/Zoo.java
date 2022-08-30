import java.util.ArrayList;
import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List list) {
    // TODO fix method declaration
    for (int i=0; i<list.size(); i++)
    {
      System.out.println("Feeding birds");
    }
    // TODO feed birds in the cycle
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    list.add(bird);
    bird.checkWings();
    System.out.println("Accepting a bird to a section");
   // }
    // TODO fix method declaration
    // TODO check flying bird wings
    // TODO add a bird to the list and print it
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List list, Bird newBird) {
    list.add(newBird);
   // list.add(new ArrayList<>())
    for (int i=0; i<list.size(); i++){
      System.out.println("Adding a bird to the birds list");
    }
    // TODO fix method declaration
    // TODO add a bird to list
    // TODO print birds in the cycle
  }
}