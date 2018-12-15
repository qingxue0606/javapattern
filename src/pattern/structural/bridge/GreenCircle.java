 package pattern.structural.bridge;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class GreenCircle implements DrawAPI {


    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
            + radius +", x: " +x+", "+ y +"]");
         
    }

}
