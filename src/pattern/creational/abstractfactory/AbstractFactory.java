 package pattern.creational.abstractfactory;


 /**
  * 为 Color 和 Shape 对象创建抽象类来获取工厂。为接口的实现类创建工厂
  * @author xiang
  * @date 2018/12/15
  */
 public abstract class AbstractFactory {
     public abstract Color getColor(String color);
     public abstract Shape getShape(String shape) ;
  }