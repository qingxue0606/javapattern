 package pattern.structural.bridge;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        //两种不同的画法，
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
        //方法执行时都不抽象的
        redCircle.draw();
        greenCircle.draw();
     }
}
