package seconds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nóra on 2017. 04. 11..
 */
public class Seconds {
  public static void main(String[] args) {
    
  }

  public List secondElements(List list) {
    List<Object> secondElements = new ArrayList<>();
    for (int i = 1; i < list.size(); i+=2) {
      secondElements.add(list.get(i));
    }
    return secondElements;
  }
}
