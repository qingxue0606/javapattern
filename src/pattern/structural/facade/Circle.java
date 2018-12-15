package pattern.structural.facade;

/**
* @author xiang
* @date 2018/12/15
*/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}