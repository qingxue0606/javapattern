package pattern.creational.prototype;

/**
* @author xiang
* @date 2018/12/15
*/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
