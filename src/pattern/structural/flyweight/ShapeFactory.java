 package pattern.structural.flyweight;

import java.util.HashMap;

/**
 * @author xiang
 * @date 2018/12/15
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    
    public static Shape getCircle(String color) {
        
        Circle circle = (Circle)circleMap.get(color);
        //有就直接返回，没有就新建一个，存在map中
        if(circle == null) {
           circle = new Circle(color);
           circleMap.put(color, circle);
           System.out.println("Creating circle of color : " + color);
        }
        
        return circle;
     }
    

}
