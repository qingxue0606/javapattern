 package pattern.creational.abstractfactory;

 /**
 * @author xiang
 * @date 2018/12/15
 */
 public class Red implements Color {
     
     @Override
     public void fill() {
        System.out.println("Inside Red::fill() method.");
     }
  }