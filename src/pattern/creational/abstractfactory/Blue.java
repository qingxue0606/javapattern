 package pattern.creational.abstractfactory;

 /**
 * @author xiang
 * @date 2018/12/15
 */
 public class Blue implements Color {
     
     @Override
     public void fill() {
        System.out.println("Inside Blue::fill() method.");
     }
  }