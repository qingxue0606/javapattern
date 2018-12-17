 package pattern.behavioral.interpreter;

 public class InterpreterPatternDemo {
   //规则：Robert 和 John 是男性
     public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);    
     }
     
   //规则：Julie 是一个已婚的女性
     public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);    
     }
     
     public static void main(String[] args) {
         Expression isMale = getMaleExpression();
         Expression isMarriedWoman = getMarriedWomanExpression();
       //字里要求既包含 John 或包含Robert
         System.out.println("John is male? " + isMale.interpret("John"));
         System.out.println("Julie is a married women? " 
             //字里要求既包含 Julie 又包含Married
         + isMarriedWoman.interpret("Married Julie"));
      }

}
