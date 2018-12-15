 package pattern.creational.factory;

 /**
 * @author xiang
 * @date 2018/12/14
 */
public class ShapeFactory {
  //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if(shapeType==null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
         }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
         }
        return null;
        
    }
}
