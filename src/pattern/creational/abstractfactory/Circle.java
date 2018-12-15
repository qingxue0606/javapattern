 package pattern.creational.abstractfactory;

 /**
 * @author xiang
 * @date 2018/12/15
 */
 public class Circle implements Shape {
     
     @Override
     public void draw() {
        System.out.println("Inside Circle::draw() method.");
     }
  }