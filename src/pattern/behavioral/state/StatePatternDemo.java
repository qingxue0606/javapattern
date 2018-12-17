 package pattern.behavioral.state;

 public class StatePatternDemo {
     public static void main(String[] args) {
         Context context = new Context();
    
         StartState startState = new StartState();
         //当context为startState状态，执行相应的方法
         startState.doAction(context);
    
         System.out.println(context.getState().toString());
       //当context为StopState状态，执行相应的方法
         StopState stopState = new StopState();
         stopState.doAction(context);
    
         System.out.println(context.getState().toString());
      }
}
