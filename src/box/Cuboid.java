package box;

/**
 * Created by Nóra on 2017. 04. 11..
 */
public class Cuboid {
  int x, y, z;

  public Cuboid(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public int getSurface() {
    int surface = 2 * (x*y + x*z + z*x);
    return surface;
  }
  public int getVolume() {
    int volume = x*y*z;
    return volume;
  }
}
