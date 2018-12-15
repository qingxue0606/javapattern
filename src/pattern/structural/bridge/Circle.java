 package pattern.structural.bridge;

 /**
  * 用父类的成员的方法去做父类的抽象方法的实同
 * @author xiang
 * @date 2018/12/15
 */
public class Circle extends Shape {
    private int x, y, radius;
    /**
     * @param drawAPI
     */
    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;  
        this.y = y;  
        this.radius = radius;

    }
    /** (non-Javadoc)
     * @see pattern.structural.bridge.Shape#draw()
     * 
     * 这部分可以实现不同的方式，可以画圆，可以画方
     */
    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
         
    }




}
