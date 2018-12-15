 package pattern.creational.abstractfactory;

 /**
 * @author xiang
 * @date 2018/12/15
 */
 public class Rectangle implements Shape {
     
     @Override
     public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
     }
  }
