 package pattern.structural.decorator;

 /**
  * 拿红边装饰，
  * 可以再写一个新的实现类。拿 蓝边装饰
 * @author xiang
 * @date 2018/12/15
 */
public class RedShapeDecorator extends ShapeDecorator {

    /**
     * @param decoratedShape
     */
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
         // TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {
        //相当于拿红边给这个对象的方法进行装饰
        decoratedShape.draw();   
        setRedBorder(decoratedShape);
        
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
     }

}
