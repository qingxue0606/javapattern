 package pattern.structural.bridge;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class RedCircle implements DrawAPI {

    /** (non-Javadoc)
     * @see pattern.structural.bridge.DrawAPI#drawCircle(int, int, int)
     */
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
            + radius +", x: " +x+", "+ y +"]");
         
    }

}
