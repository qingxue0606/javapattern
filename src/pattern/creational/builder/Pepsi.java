 package pattern.creational.builder;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class Pepsi  extends ColdDrink{

    /** (non-Javadoc)
     * @see pattern.creational.builder.Item#name()
     */
    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "Pepsi";
    }

    /** (non-Javadoc)
     * @see pattern.creational.builder.Item#price()
     */
    @Override
    public float price() {
        // TODO Auto-generated method stub
        return 35.0f;
    }

}
