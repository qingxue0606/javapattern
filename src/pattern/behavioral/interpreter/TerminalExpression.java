 package pattern.behavioral.interpreter;

 public class TerminalExpression implements Expression {
     //实现了接口，
     private String data;
     public TerminalExpression(String data){
         this.data = data; 
      }
     
     
    @Override
    public boolean interpret(String context) {
        //context里包含data返回true
        if(context.contains(data)){
            return true;
         }
        return false;
    }

}
