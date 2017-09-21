import java.util.ArrayList;

/**
 * Created by Palina_Piarlukhina on 9/7/2017.
 */

/**
 * Change by places first and last letters in each second string of list or array
 */
public class Main {

  public static void main(String []args){
    ArrayList<String> list = new ArrayList<>();
    list.add(0, "String1");
    list.add(1, "String2");//
    list.add(2, "String3");
    list.add(3, "String4");
    list.add(4, "String5");
    list.add(5, "String6");
    list.add(6, "String7");

    Revert r = new Revert();
    r.changeEverySecondItem(list);

    for (String s: list){
      System.out.println(s);
    }
  }
}
