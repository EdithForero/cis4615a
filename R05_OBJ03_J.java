
/** ************************************************************
 * Edith Forero
 * Rule 05. Object Orientation (OBJ)
 * OBJ03-J. Prevent heap pollution
 * Compliant Solution (Parameterized Collection)
 * CIS4615 HW2
 * **************************************************************/

import java.util.ArrayList;
import java.util.List;

public class R05_OBJ03_J {

 private static void addToList(List<String> list, String str) {
    list.add(str);     // No warning generated
  }
 
  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    addToList(list, "42");
    addToList(list, "52");
    System.out.println(list.get(0));
    System.out.println(list.get(1));
  }
}
