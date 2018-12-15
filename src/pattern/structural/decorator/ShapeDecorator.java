package pattern.structural.decorator;

/**
 * 实现类可以装饰
 * 这个类主要是保证对象的一致性
* @author xiang
* @date 2018/12/15
*/
public abstract class ShapeDecorator implements Shape  {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }

}
