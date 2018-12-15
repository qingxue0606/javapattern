package pattern.creational.prototype;

/**
* @author xiang
* @date 2018/12/15
*/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");

    }

}
