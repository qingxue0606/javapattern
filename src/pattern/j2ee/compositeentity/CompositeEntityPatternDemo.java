 package pattern.j2ee.compositeentity;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }

}
