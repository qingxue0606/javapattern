package pattern.creational.prototype;

/**
* @author xiang
* @date 2018/12/15
*/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
