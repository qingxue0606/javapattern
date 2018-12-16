 package pattern.behavioral.state;

 public class StartState  implements State {

    @Override
    public void doAction(Context context) {
        //不同状态的形为
        System.out.println("Player is in start state");
        //设为当前的状态
        context.setState(this); 
    }
    public String toString(){
        return "Start State";
     }

}
