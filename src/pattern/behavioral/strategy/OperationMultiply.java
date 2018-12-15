 package pattern.behavioral.strategy;

 /**
 * @author xiang
 * @date 2018/12/14
 */
 public class OperationMultiply implements Strategy{
     @Override
     public int doOperation(int num1, int num2) {
        return num1 * num2;
     }
  }