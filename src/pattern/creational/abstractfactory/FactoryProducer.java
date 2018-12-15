 package pattern.creational.abstractfactory;

 /**
  * 
  * 这一个实际的工厂，通过这个工厂得到一个整套的特定接口的工厂
 * @author xiang
 * @date 2018/12/15
 */
 public class FactoryProducer {
     public static AbstractFactory getFactory(String choice){
         //得到shape工厂
        if(choice.equalsIgnoreCase("SHAPE")){
           return new ShapeFactory();
           //得到color工厂
        } else if(choice.equalsIgnoreCase("COLOR")){
           return new ColorFactory();
        }
        return null;
     }
  }
