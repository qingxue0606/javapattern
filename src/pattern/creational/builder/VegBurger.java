 package pattern.creational.builder;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class VegBurger extends Burger {

    /** (non-Javadoc)
     * @see pattern.creational.builder.Item#name()
     */
    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "Veg Burger";
    }

    /** (non-Javadoc)
     * @see pattern.creational.builder.Item#price()
     */
    @Override
    public float price() {
        // TODO Auto-generated method stub
        return 25.0f;
    }

}
