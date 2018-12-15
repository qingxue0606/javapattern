package pattern.structural.facade;

/**
* @author xiang
* @date 2018/12/15
*/
public class FacadePatternDemo {
    public static void main(String[] args) {
        //只要找到这个人就行了，他干什么都行
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
