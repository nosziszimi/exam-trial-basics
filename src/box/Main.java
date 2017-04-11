package box;

/**
 * Created by Nóra on 2017. 04. 11..
 */
public class Main {

  public static void main(String[] args) {
    Cuboid dice = new Cuboid(3,5,8);
    System.out.println(dice.getSurface());
    System.out.println(dice.getVolume());
  }
}
