package pattern.structural.facade;

/**
* @author xiang
* @date 2018/12/15
*/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}