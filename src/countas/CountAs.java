package countas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nóra on 2017. 04. 11..
 */
public class CountAs {

  public static void main(String[] args) {
    System.out.println(aCounter("afile.txt"));
  }
  public static int aCounter(String fileName) {
    int aCounter = 0;
    Path path = Paths.get("countas/" + fileName);
    try {
      List<String> lines = new ArrayList<>(Files.readAllLines(path));
      for (String line : lines) {
        while (line.length() != 0) {
          if (fileName.charAt(0) == 'a') {
            aCounter++;
          }
        }
      }
    } catch (IOException e) {
      System.out.println(0);
    }
    return aCounter;
  }
}
