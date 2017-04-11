package box;

/**
 * Created by Nóra on 2017. 04. 11..
 */

// Create a class that represents a cuboid:
// It should take its three dimensions as constructor parameters (numbers)
// It should have a method called `getSurface` that returns the cuboid's surface
// It should have a method called `getVolume` that returns the cuboid's volume

public class Cuboid {
  int x, y, z;

  public Cuboid(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public int getSurface() {
    int surface = 2 * (x*y + x*z + z*y);
    return surface;
  }
  public int getVolume() {
    int volume = x*y*z;
    return volume;
  }
}
