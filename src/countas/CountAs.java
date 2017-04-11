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
        String lowercaseLine = line.toLowerCase();
        while (lowercaseLine.length() != 0) {
          if (lowercaseLine.charAt(0) == 'a') {
            aCounter++;
          }
          lowercaseLine.substring(1);
        }
      }
    } catch (IOException e) {
      aCounter = 0;
    }
    return aCounter;
  }
}
