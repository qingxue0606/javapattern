 package pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
//集合的所有的备忘
public class CareTaker {
     private List<Memento> mementoList = new ArrayList<Memento>();
     public void add(Memento state){
         mementoList.add(state);
      }
     public Memento get(int index){
         return mementoList.get(index);
      }
}
