 package pattern.behavioral.state;

 public class StopState implements State {
     
     public void doAction(Context context) {
       //不同状态的形为
        System.out.println("Player is in stop state");
      //设为当前的状态
        context.setState(this); 
     }
     public String toString(){
        return "Stop State";
     }
  }