import java.util.ArrayList;

/**
 * Created by Palina_Piarlukhina on 9/7/2017.
 */
public class Revert {

  public Revert(){}

  public void changeEverySecondItem(ArrayList<String> list){
    for(int i = 0; i<list.size(); i++){
      if(i==1 || i%2==1){
        String s = list.get(i);
        list.remove(i);
        list.add(i, swapFirstLastLetters(s));
      }
    }
  }

  private String swapFirstLastLetters(String s){
    char [] source = s.toCharArray();
    if (source.length==0){
      return"";
    } else {
      return source[s.length()-1]+s.substring(1,s.length()-1)+source[0];
    }
  }
}
