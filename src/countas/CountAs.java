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

// Create a function that takes a filename as string parameter,
// counts the occurances of the letter "a", and returns it as a number.
// If the file does not exist, the function should return 0 and not break.

// example: on the input "afile.txt" the function should return 28 - print this result
// example: on the input "not-a-file" the function should return 0 - print this result

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
        for (int i = 0; i < lowercaseLine.length(); i++) {
          if (lowercaseLine.charAt(i) == 'a') {
            aCounter++;
          }
        }
      }
    } catch (IOException e) {
      aCounter = 0;
    }
    return aCounter;
  }
}
