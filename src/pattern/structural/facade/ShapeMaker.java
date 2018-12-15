 package pattern.structural.facade;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class ShapeMaker {
    /**
     * 相当于一个全懂的人干了所有能干的事情。
     */
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
     }
    public void drawCircle(){
        circle.draw();
     }
     public void drawRectangle(){
        rectangle.draw();
     }
     public void drawSquare(){
        square.draw();
     }

}
