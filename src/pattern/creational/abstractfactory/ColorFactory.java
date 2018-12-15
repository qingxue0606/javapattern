 package pattern.creational.abstractfactory;

 /**
  * 
  * 这是一个color工厂
 * @author xiang
 * @date 2018/12/15
 */
 public class ColorFactory extends AbstractFactory {
     
     @Override
     public Shape getShape(String shapeType){
        return null;
     }
     
     @Override
     public Color getColor(String color) {
        if(color == null){
           return null;
        }        
        if(color.equalsIgnoreCase("RED")){
           return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
           return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
           return new Blue();
        }
        return null;
     }
  }