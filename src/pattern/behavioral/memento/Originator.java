 package pattern.behavioral.memento;
//这个类就是一个备忘类
 public class Originator {
     
     private String state;
     
     public void setState(String state){
        this.state = state;
     }
     public String getState(){
         return state;
      }
     public Memento saveStateToMemento(){
         return new Memento(state);
      }
     public void getStateFromMemento(Memento Memento){
         state = Memento.getState();
      }

}
